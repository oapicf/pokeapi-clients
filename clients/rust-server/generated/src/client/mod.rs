use async_trait::async_trait;
use bytes::Bytes;
use futures::{Stream, future, future::BoxFuture, stream, future::TryFutureExt, future::FutureExt, stream::StreamExt};
use http_body_util::{combinators::BoxBody, Full};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use hyper::{body::{Body, Incoming}, Request, Response, service::Service, Uri};
use percent_encoding::{utf8_percent_encode, AsciiSet};
use std::borrow::Cow;
use std::convert::{TryInto, Infallible};
use std::io::{ErrorKind, Read};
use std::error::Error;
use std::future::Future;
use std::fmt;
use std::marker::PhantomData;
use std::path::Path;
use std::sync::{Arc, Mutex};
use std::str;
use std::str::FromStr;
use std::string::ToString;
use std::task::{Context, Poll};
use swagger::{ApiError, AuthData, BodyExt, Connector, DropContextService, Has, XSpanIdString};
use url::form_urlencoded;
use tower_service::Service as _;


use crate::models;
use crate::header;

/// https://url.spec.whatwg.org/#fragment-percent-encode-set
#[allow(dead_code)]
const FRAGMENT_ENCODE_SET: &AsciiSet = &percent_encoding::CONTROLS
    .add(b' ').add(b'"').add(b'<').add(b'>').add(b'`');

/// This encode set is used for object IDs
///
/// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
/// the vertical bar (|) is encoded.
#[allow(dead_code)]
const ID_ENCODE_SET: &AsciiSet = &FRAGMENT_ENCODE_SET.add(b'|');

use crate::{Api,
     BerryFirmnessListResponse,
     BerryFlavorListResponse,
     BerryListResponse,
     BerryFirmnessRetrieveResponse,
     BerryFlavorRetrieveResponse,
     BerryRetrieveResponse,
     ContestEffectListResponse,
     ContestTypeListResponse,
     SuperContestEffectListResponse,
     ContestEffectRetrieveResponse,
     ContestTypeRetrieveResponse,
     SuperContestEffectRetrieveResponse,
     EncounterConditionListResponse,
     EncounterConditionValueListResponse,
     EncounterMethodListResponse,
     EncounterConditionRetrieveResponse,
     EncounterConditionValueRetrieveResponse,
     EncounterMethodRetrieveResponse,
     PokemonEncountersRetrieveResponse,
     EvolutionChainListResponse,
     EvolutionTriggerListResponse,
     EvolutionChainRetrieveResponse,
     EvolutionTriggerRetrieveResponse,
     GenerationListResponse,
     PokedexListResponse,
     VersionGroupListResponse,
     VersionListResponse,
     GenerationRetrieveResponse,
     PokedexRetrieveResponse,
     VersionGroupRetrieveResponse,
     VersionRetrieveResponse,
     ItemAttributeListResponse,
     ItemCategoryListResponse,
     ItemFlingEffectListResponse,
     ItemListResponse,
     ItemPocketListResponse,
     ItemAttributeRetrieveResponse,
     ItemCategoryRetrieveResponse,
     ItemFlingEffectRetrieveResponse,
     ItemPocketRetrieveResponse,
     ItemRetrieveResponse,
     LocationAreaListResponse,
     LocationListResponse,
     PalParkAreaListResponse,
     RegionListResponse,
     LocationAreaRetrieveResponse,
     LocationRetrieveResponse,
     PalParkAreaRetrieveResponse,
     RegionRetrieveResponse,
     MachineListResponse,
     MachineRetrieveResponse,
     MoveAilmentListResponse,
     MoveBattleStyleListResponse,
     MoveCategoryListResponse,
     MoveLearnMethodListResponse,
     MoveListResponse,
     MoveTargetListResponse,
     MoveAilmentRetrieveResponse,
     MoveBattleStyleRetrieveResponse,
     MoveCategoryRetrieveResponse,
     MoveLearnMethodRetrieveResponse,
     MoveRetrieveResponse,
     MoveTargetRetrieveResponse,
     AbilityListResponse,
     CharacteristicListResponse,
     EggGroupListResponse,
     GenderListResponse,
     GrowthRateListResponse,
     MoveDamageClassListResponse,
     NatureListResponse,
     PokeathlonStatListResponse,
     PokemonColorListResponse,
     PokemonFormListResponse,
     PokemonHabitatListResponse,
     PokemonListResponse,
     PokemonShapeListResponse,
     PokemonSpeciesListResponse,
     StatListResponse,
     TypeListResponse,
     AbilityRetrieveResponse,
     CharacteristicRetrieveResponse,
     EggGroupRetrieveResponse,
     GenderRetrieveResponse,
     GrowthRateRetrieveResponse,
     MoveDamageClassRetrieveResponse,
     NatureRetrieveResponse,
     PokeathlonStatRetrieveResponse,
     PokemonColorRetrieveResponse,
     PokemonFormRetrieveResponse,
     PokemonHabitatRetrieveResponse,
     PokemonRetrieveResponse,
     PokemonShapeRetrieveResponse,
     PokemonSpeciesRetrieveResponse,
     StatRetrieveResponse,
     TypeRetrieveResponse,
     LanguageListResponse,
     LanguageRetrieveResponse
     };

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: impl TryInto<Uri, Error=hyper::http::uri::InvalidUri>, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = input.try_into()?;

    let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or(ClientInitError::MissingHost)?;
    let port = uri.port_u16().map(|x| format!(":{x}")).unwrap_or_default();
    Ok(format!("{scheme}://{host}{port}{}", uri.path().trim_end_matches('/')))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Inner service
    client_service: S,

    /// Base path of the API
    base_path: String,

    /// Marker
    marker: PhantomData<fn(C)>,
}

impl<S, C> fmt::Debug for Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<S, C> Clone for Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Self {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone(),
            marker: PhantomData,
        }
    }
}

impl<Connector, C> Client<
    DropContextService<
        hyper_util::service::TowerToHyperService<
            hyper_util::client::legacy::Client<
                Connector,
                BoxBody<Bytes, Infallible>
            >
        >,
        C
    >,
    C
> where
    Connector: hyper_util::client::legacy::connect::Connect + Clone + Send + Sync + 'static,
    C: Clone + Send + Sync + 'static,
{
    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with `swagger::Connector::builder()`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector` - Implementation of `hyper::client::Connect` to use for the client
    pub fn try_new_with_connector(
        base_path: &str,
        protocol: Option<&'static str>,
        connector: Connector,
    ) -> Result<Self, ClientInitError>
    {
        let client_service = hyper_util::client::legacy::Client::builder(hyper_util::rt::TokioExecutor::new()).build(connector);
        let client_service = DropContextService::new(hyper_util::service::TowerToHyperService::new(client_service));

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, protocol)?,
            marker: PhantomData,
        })
    }
}

#[derive(Debug, Clone)]
pub enum HyperClient {
    Http(hyper_util::client::legacy::Client<hyper_util::client::legacy::connect::HttpConnector, BoxBody<Bytes, Infallible>>),
    Https(hyper_util::client::legacy::Client<HttpsConnector, BoxBody<Bytes, Infallible>>),
}

impl Service<Request<BoxBody<Bytes, Infallible>>> for HyperClient {
    type Response = Response<Incoming>;
    type Error = hyper_util::client::legacy::Error;
    type Future = hyper_util::client::legacy::ResponseFuture;

    fn call(&self, req: Request<BoxBody<Bytes, Infallible>>) -> Self::Future {
       match self {
          HyperClient::Http(client) => client.request(req),
          HyperClient::Https(client) => client.request(req)
       }
    }
}

impl<C> Client<DropContextService<HyperClient, C>, C> where
    C: Clone + Send + Sync + 'static,
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    pub fn try_new(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let uri = Uri::from_str(base_path)?;

        let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;
        let scheme = scheme.to_ascii_lowercase();

        let connector = Connector::builder();

        let client_service = match scheme.as_str() {
            "http" => {
                HyperClient::Http(hyper_util::client::legacy::Client::builder(hyper_util::rt::TokioExecutor::new()).build(connector.build()))
            },
            "https" => {
                let connector = connector.https()
                   .build()
                   .map_err(ClientInitError::SslError)?;
                HyperClient::Https(hyper_util::client::legacy::Client::builder(hyper_util::rt::TokioExecutor::new()).build(connector))
            },
            _ => {
                return Err(ClientInitError::InvalidScheme);
            }
        };

        let client_service = DropContextService::new(client_service);

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

impl<C> Client<
    DropContextService<
        hyper_util::service::TowerToHyperService<
            hyper_util::client::legacy::Client<
                hyper_util::client::legacy::connect::HttpConnector,
                BoxBody<Bytes, Infallible>
            >
        >,
        C
    >,
    C
> where
    C: Clone + Send + Sync + 'static
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    pub fn try_new_http(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let http_connector = Connector::builder().build();

        Self::try_new_with_connector(base_path, Some("http"), http_connector)
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
type HttpsConnector = hyper_tls::HttpsConnector<hyper_util::client::legacy::connect::HttpConnector>;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
type HttpsConnector = hyper_openssl::client::legacy::HttpsConnector<hyper_util::client::legacy::connect::HttpConnector>;

impl<C> Client<
    DropContextService<
        hyper_util::service::TowerToHyperService<
            hyper_util::client::legacy::Client<
                HttpsConnector,
                BoxBody<Bytes, Infallible>
            >
        >,
        C
    >,
    C
> where
    C: Clone + Send + Sync + 'static
{
    /// Create a client with a TLS connection to the server
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    pub fn try_new_https(base_path: &str) -> Result<Self, ClientInitError>
    {
        let https_connector = Connector::builder()
            .https()
            .build()
            .map_err(ClientInitError::SslError)?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a TLS connection to the server using a pinned certificate
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_pinned<CA>(
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .build()
            .map_err(ClientInitError::SslError)?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_mutual<CA, K, D>(
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: D,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        D: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .client_authentication(client_key, client_certificate)
            .build()
            .map_err(ClientInitError::SslError)?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }
}

impl<S, C> Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper::service::Service` /
    /// `tower::Service`
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(
        client_service: S,
        base_path: &str,
    ) -> Result<Self, ClientInitError>
    {
        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

/// Error type failing to create a Client
#[derive(Debug)]
pub enum ClientInitError {
    /// Invalid URL Scheme
    InvalidScheme,

    /// Invalid URI
    InvalidUri(hyper::http::uri::InvalidUri),

    /// Missing Hostname
    MissingHost,

    /// SSL Connection Error
    #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
    SslError(native_tls::Error),

    /// SSL Connection Error
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    SslError(openssl::error::ErrorStack),
}

impl From<hyper::http::uri::InvalidUri> for ClientInitError {
    fn from(err: hyper::http::uri::InvalidUri) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        let s: &dyn fmt::Debug = self;
        s.fmt(f)
    }
}

impl Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}

#[allow(dead_code)]
fn body_from_string(s: String) -> BoxBody<Bytes, Infallible> {
    BoxBody::new(Full::new(Bytes::from(s)))
}

#[async_trait]
impl<S, C, B> Api<C> for Client<S, C> where
    S: Service<
       (Request<BoxBody<Bytes, Infallible>>, C),
       Response=Response<B>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Has<XSpanIdString> + Has<Option<AuthData>> + Clone + Send + Sync + 'static,
    B: hyper::body::Body + Send + 'static + Unpin,
    B::Data: Send,
    B::Error: Into<Box<dyn Error + Send + Sync>>,
{

    #[allow(clippy::vec_init_then_push)]
    async fn berry_firmness_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<BerryFirmnessListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/berry-firmness/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedBerryFirmnessSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(BerryFirmnessListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn berry_flavor_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<BerryFlavorListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/berry-flavor/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedBerryFlavorSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(BerryFlavorListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn berry_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<BerryListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/berry/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedBerrySummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(BerryListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn berry_firmness_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<BerryFirmnessRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/berry-firmness/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::BerryFirmnessDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(BerryFirmnessRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn berry_flavor_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<BerryFlavorRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/berry-flavor/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::BerryFlavorDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(BerryFlavorRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn berry_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<BerryRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/berry/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::BerryDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(BerryRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn contest_effect_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ContestEffectListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/contest-effect/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedContestEffectSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ContestEffectListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn contest_type_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ContestTypeListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/contest-type/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedContestTypeSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ContestTypeListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn super_contest_effect_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<SuperContestEffectListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/super-contest-effect/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedSuperContestEffectSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(SuperContestEffectListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn contest_effect_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ContestEffectRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/contest-effect/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ContestEffectDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ContestEffectRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn contest_type_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ContestTypeRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/contest-type/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ContestTypeDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ContestTypeRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn super_contest_effect_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<SuperContestEffectRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/super-contest-effect/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::SuperContestEffectDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(SuperContestEffectRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn encounter_condition_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<EncounterConditionListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/encounter-condition/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedEncounterConditionSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EncounterConditionListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn encounter_condition_value_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<EncounterConditionValueListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/encounter-condition-value/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedEncounterConditionValueSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EncounterConditionValueListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn encounter_method_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<EncounterMethodListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/encounter-method/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedEncounterMethodSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EncounterMethodListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn encounter_condition_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<EncounterConditionRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/encounter-condition/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::EncounterConditionDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EncounterConditionRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn encounter_condition_value_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<EncounterConditionValueRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/encounter-condition-value/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::EncounterConditionValueDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EncounterConditionValueRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn encounter_method_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<EncounterMethodRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/encounter-method/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::EncounterMethodDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EncounterMethodRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_encounters_retrieve(
        &self,
        param_pokemon_id: String,
        context: &C) -> Result<PokemonEncountersRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon/{pokemon_id}/encounters",
            self.base_path
            ,pokemon_id=utf8_percent_encode(&param_pokemon_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<Vec<models::PokemonEncountersRetrieve200ResponseInner>>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonEncountersRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn evolution_chain_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<EvolutionChainListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/evolution-chain/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedEvolutionChainSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EvolutionChainListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn evolution_trigger_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<EvolutionTriggerListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/evolution-trigger/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedEvolutionTriggerSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EvolutionTriggerListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn evolution_chain_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<EvolutionChainRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/evolution-chain/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::EvolutionChainDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EvolutionChainRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn evolution_trigger_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<EvolutionTriggerRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/evolution-trigger/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::EvolutionTriggerDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EvolutionTriggerRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn generation_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<GenerationListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/generation/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedGenerationSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GenerationListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokedex_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokedexListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokedex/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokedexSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokedexListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn version_group_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<VersionGroupListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/version-group/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedVersionGroupSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(VersionGroupListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn version_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<VersionListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/version/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedVersionSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(VersionListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn generation_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<GenerationRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/generation/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::GenerationDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GenerationRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokedex_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokedexRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokedex/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokedexDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokedexRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn version_group_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<VersionGroupRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/version-group/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::VersionGroupDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(VersionGroupRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn version_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<VersionRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/version/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::VersionDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(VersionRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_attribute_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ItemAttributeListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-attribute/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedItemAttributeSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemAttributeListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_category_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ItemCategoryListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-category/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedItemCategorySummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemCategoryListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_fling_effect_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ItemFlingEffectListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-fling-effect/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedItemFlingEffectSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemFlingEffectListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ItemListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedItemSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_pocket_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<ItemPocketListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-pocket/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedItemPocketSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemPocketListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_attribute_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ItemAttributeRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-attribute/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ItemAttributeDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemAttributeRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_category_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ItemCategoryRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-category/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ItemCategoryDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemCategoryRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_fling_effect_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ItemFlingEffectRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-fling-effect/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ItemFlingEffectDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemFlingEffectRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_pocket_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ItemPocketRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item-pocket/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ItemPocketDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemPocketRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn item_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<ItemRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/item/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ItemDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ItemRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn location_area_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        context: &C) -> Result<LocationAreaListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/location-area/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedLocationAreaSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(LocationAreaListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn location_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<LocationListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/location/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedLocationSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(LocationListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pal_park_area_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PalParkAreaListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pal-park-area/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPalParkAreaSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PalParkAreaListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn region_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<RegionListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/region/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedRegionSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(RegionListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn location_area_retrieve(
        &self,
        param_id: i32,
        context: &C) -> Result<LocationAreaRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/location-area/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::LocationAreaDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(LocationAreaRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn location_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<LocationRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/location/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::LocationDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(LocationRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pal_park_area_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PalParkAreaRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pal-park-area/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PalParkAreaDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PalParkAreaRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn region_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<RegionRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/region/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RegionDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(RegionRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn machine_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MachineListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/machine/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMachineSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MachineListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn machine_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MachineRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/machine/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MachineDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MachineRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_ailment_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveAilmentListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-ailment/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveMetaAilmentSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveAilmentListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_battle_style_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveBattleStyleListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-battle-style/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveBattleStyleSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveBattleStyleListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_category_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveCategoryListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-category/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveMetaCategorySummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveCategoryListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_learn_method_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveLearnMethodListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-learn-method/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveLearnMethodSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveLearnMethodListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_target_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveTargetListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-target/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveTargetSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveTargetListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_ailment_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveAilmentRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-ailment/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveMetaAilmentDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveAilmentRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_battle_style_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveBattleStyleRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-battle-style/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveBattleStyleDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveBattleStyleRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_category_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveCategoryRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-category/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveMetaCategoryDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveCategoryRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_learn_method_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveLearnMethodRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-learn-method/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveLearnMethodDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveLearnMethodRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_target_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveTargetRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-target/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveTargetDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveTargetRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn ability_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<AbilityListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/ability/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedAbilitySummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(AbilityListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn characteristic_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<CharacteristicListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/characteristic/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedCharacteristicSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CharacteristicListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn egg_group_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<EggGroupListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/egg-group/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedEggGroupSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EggGroupListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn gender_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<GenderListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/gender/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedGenderSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GenderListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn growth_rate_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<GrowthRateListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/growth-rate/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedGrowthRateSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GrowthRateListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_damage_class_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<MoveDamageClassListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-damage-class/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedMoveDamageClassSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveDamageClassListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn nature_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<NatureListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/nature/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedNatureSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(NatureListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokeathlon_stat_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokeathlonStatListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokeathlon-stat/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokeathlonStatSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokeathlonStatListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_color_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokemonColorListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-color/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokemonColorSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonColorListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_form_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokemonFormListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-form/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokemonFormSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonFormListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_habitat_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokemonHabitatListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-habitat/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokemonHabitatSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonHabitatListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokemonListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokemonSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_shape_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokemonShapeListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-shape/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokemonShapeSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonShapeListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_species_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<PokemonSpeciesListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-species/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedPokemonSpeciesSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonSpeciesListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn stat_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<StatListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/stat/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedStatSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(StatListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn type_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<TypeListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/type/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedTypeSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(TypeListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn ability_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<AbilityRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/ability/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::AbilityDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(AbilityRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn characteristic_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<CharacteristicRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/characteristic/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CharacteristicDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CharacteristicRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn egg_group_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<EggGroupRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/egg-group/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::EggGroupDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(EggGroupRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn gender_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<GenderRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/gender/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::GenderDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GenderRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn growth_rate_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<GrowthRateRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/growth-rate/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::GrowthRateDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GrowthRateRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn move_damage_class_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<MoveDamageClassRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/move-damage-class/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MoveDamageClassDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(MoveDamageClassRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn nature_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<NatureRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/nature/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::NatureDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(NatureRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokeathlon_stat_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokeathlonStatRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokeathlon-stat/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokeathlonStatDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokeathlonStatRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_color_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokemonColorRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-color/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokemonColorDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonColorRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_form_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokemonFormRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-form/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokemonFormDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonFormRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_habitat_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokemonHabitatRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-habitat/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokemonHabitatDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonHabitatRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokemonRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokemonDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_shape_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokemonShapeRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-shape/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokemonShapeDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonShapeRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn pokemon_species_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<PokemonSpeciesRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/pokemon-species/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PokemonSpeciesDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(PokemonSpeciesRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn stat_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<StatRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/stat/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::StatDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(StatRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn type_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<TypeRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/type/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::TypeDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(TypeRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn language_list(
        &self,
        param_limit: Option<i32>,
        param_offset: Option<i32>,
        param_q: Option<String>,
        context: &C) -> Result<LanguageListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/language/",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_offset) = param_offset {
                query_string.append_pair("offset",
                    &param_offset.to_string());
            }
            if let Some(param_q) = param_q {
                query_string.append_pair("q",
                    &param_q);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::PaginatedLanguageSummaryList>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(LanguageListResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn language_retrieve(
        &self,
        param_id: String,
        context: &C) -> Result<LanguageRetrieveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/api/v2/language/{id}/",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(ref basic_user, ref basic_password) => {
                    let auth = headers::Authorization::basic(basic_user.as_str(), basic_password.as_str());
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        auth.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::LanguageDetail>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(LanguageRetrieveResponse::Status200
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

}
