//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::http1;
use hyper_util::rt::TokioIo;
use hyper::service::{service_fn, Service};
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr: SocketAddr = addr.parse().expect("Failed to parse bind address");
    let listener = TcpListener::bind(&addr).await.unwrap();

    let server = Server::new();

    let service = MakeService::new(server);
    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, addr)) = listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        http1::Builder::new()
                            .serve_connection(TokioIo::new(tls), service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        println!("Listening on http://{}", addr);

        loop {
            // When an incoming TCP connection is received grab a TCP stream for
            // client<->server communication.
            //
            // Note, this is a .await point, this loop will loop forever but is not a busy loop. The
            // .await point allows the Tokio runtime to pull the task off of the thread until the task
            // has work to do. In this case, a connection arrives on the port we are listening on and
            // the task is woken up, at which point the task is then put back on a thread, and is
            // driven forward by the runtime, eventually yielding a TCP stream.
            let (tcp_stream, addr) = listener.accept().await.expect("Failed to accept connection");

            let service = service.call(addr).await.unwrap();
            let io = TokioIo::new(tcp_stream);
            // Spin up a new task in Tokio so we can continue to listen for new TCP connection on the
            // current task without waiting for the processing of the HTTP1 connection we just received
            // to finish
            tokio::task::spawn(async move {
                // Handle the connection from the client using HTTP1 and pass any
                // HTTP requests received on that connection to the `hello` function
                let result = http1::Builder::new()
                    .serve_connection(io, service)
                    .await;
                if let Err(err) = result
                {
                    println!("Error serving connection: {err:?}");
                }
            });
        }
    }
}

#[derive(Copy)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Clone for Server<C> {
    fn clone(&self) -> Self {
        Self {
            marker: PhantomData,
        }
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
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
    LanguageRetrieveResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// List berry firmness
    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<BerryFirmnessListResponse, ApiError>
    {
        info!("berry_firmness_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List berry flavors
    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<BerryFlavorListResponse, ApiError>
    {
        info!("berry_flavor_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List berries
    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<BerryListResponse, ApiError>
    {
        info!("berry_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get berry by firmness
    async fn berry_firmness_retrieve(
        &self,
        id: String,
        context: &C) -> Result<BerryFirmnessRetrieveResponse, ApiError>
    {
        info!("berry_firmness_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get berries by flavor
    async fn berry_flavor_retrieve(
        &self,
        id: String,
        context: &C) -> Result<BerryFlavorRetrieveResponse, ApiError>
    {
        info!("berry_flavor_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get a berry
    async fn berry_retrieve(
        &self,
        id: String,
        context: &C) -> Result<BerryRetrieveResponse, ApiError>
    {
        info!("berry_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List contest effects
    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ContestEffectListResponse, ApiError>
    {
        info!("contest_effect_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List contest types
    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ContestTypeListResponse, ApiError>
    {
        info!("contest_type_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List super contest effects
    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<SuperContestEffectListResponse, ApiError>
    {
        info!("super_contest_effect_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get contest effect
    async fn contest_effect_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ContestEffectRetrieveResponse, ApiError>
    {
        info!("contest_effect_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get contest type
    async fn contest_type_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ContestTypeRetrieveResponse, ApiError>
    {
        info!("contest_type_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get super contest effect
    async fn super_contest_effect_retrieve(
        &self,
        id: String,
        context: &C) -> Result<SuperContestEffectRetrieveResponse, ApiError>
    {
        info!("super_contest_effect_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List encounter conditions
    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EncounterConditionListResponse, ApiError>
    {
        info!("encounter_condition_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List encounter condition values
    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EncounterConditionValueListResponse, ApiError>
    {
        info!("encounter_condition_value_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List encounter methods
    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EncounterMethodListResponse, ApiError>
    {
        info!("encounter_method_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get encounter condition
    async fn encounter_condition_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EncounterConditionRetrieveResponse, ApiError>
    {
        info!("encounter_condition_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get encounter condition value
    async fn encounter_condition_value_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EncounterConditionValueRetrieveResponse, ApiError>
    {
        info!("encounter_condition_value_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get encounter method
    async fn encounter_method_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EncounterMethodRetrieveResponse, ApiError>
    {
        info!("encounter_method_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemon encounter
    async fn pokemon_encounters_retrieve(
        &self,
        pokemon_id: String,
        context: &C) -> Result<PokemonEncountersRetrieveResponse, ApiError>
    {
        info!("pokemon_encounters_retrieve(\"{}\") - X-Span-ID: {:?}", pokemon_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List evolution chains
    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EvolutionChainListResponse, ApiError>
    {
        info!("evolution_chain_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List evolution triggers
    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EvolutionTriggerListResponse, ApiError>
    {
        info!("evolution_trigger_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get evolution chain
    async fn evolution_chain_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EvolutionChainRetrieveResponse, ApiError>
    {
        info!("evolution_chain_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get evolution trigger
    async fn evolution_trigger_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EvolutionTriggerRetrieveResponse, ApiError>
    {
        info!("evolution_trigger_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List genrations
    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<GenerationListResponse, ApiError>
    {
        info!("generation_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokedex
    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokedexListResponse, ApiError>
    {
        info!("pokedex_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List version groups
    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<VersionGroupListResponse, ApiError>
    {
        info!("version_group_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List versions
    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<VersionListResponse, ApiError>
    {
        info!("version_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get genration
    async fn generation_retrieve(
        &self,
        id: String,
        context: &C) -> Result<GenerationRetrieveResponse, ApiError>
    {
        info!("generation_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokedex
    async fn pokedex_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokedexRetrieveResponse, ApiError>
    {
        info!("pokedex_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get version group
    async fn version_group_retrieve(
        &self,
        id: String,
        context: &C) -> Result<VersionGroupRetrieveResponse, ApiError>
    {
        info!("version_group_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get version
    async fn version_retrieve(
        &self,
        id: String,
        context: &C) -> Result<VersionRetrieveResponse, ApiError>
    {
        info!("version_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List item attributes
    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemAttributeListResponse, ApiError>
    {
        info!("item_attribute_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List item categories
    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemCategoryListResponse, ApiError>
    {
        info!("item_category_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List item fling effects
    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemFlingEffectListResponse, ApiError>
    {
        info!("item_fling_effect_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List items
    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemListResponse, ApiError>
    {
        info!("item_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List item pockets
    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemPocketListResponse, ApiError>
    {
        info!("item_pocket_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item attribute
    async fn item_attribute_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemAttributeRetrieveResponse, ApiError>
    {
        info!("item_attribute_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item category
    async fn item_category_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemCategoryRetrieveResponse, ApiError>
    {
        info!("item_category_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item fling effect
    async fn item_fling_effect_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemFlingEffectRetrieveResponse, ApiError>
    {
        info!("item_fling_effect_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item pocket
    async fn item_pocket_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemPocketRetrieveResponse, ApiError>
    {
        info!("item_pocket_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item
    async fn item_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemRetrieveResponse, ApiError>
    {
        info!("item_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List location areas
    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LocationAreaListResponse, ApiError>
    {
        info!("location_area_list({:?}, {:?}) - X-Span-ID: {:?}", limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List locations
    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<LocationListResponse, ApiError>
    {
        info!("location_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pal park areas
    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PalParkAreaListResponse, ApiError>
    {
        info!("pal_park_area_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List regions
    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<RegionListResponse, ApiError>
    {
        info!("region_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get location area
    async fn location_area_retrieve(
        &self,
        id: i32,
        context: &C) -> Result<LocationAreaRetrieveResponse, ApiError>
    {
        info!("location_area_retrieve({}) - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get location
    async fn location_retrieve(
        &self,
        id: String,
        context: &C) -> Result<LocationRetrieveResponse, ApiError>
    {
        info!("location_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pal park area
    async fn pal_park_area_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PalParkAreaRetrieveResponse, ApiError>
    {
        info!("pal_park_area_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get region
    async fn region_retrieve(
        &self,
        id: String,
        context: &C) -> Result<RegionRetrieveResponse, ApiError>
    {
        info!("region_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List machines
    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MachineListResponse, ApiError>
    {
        info!("machine_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get machine
    async fn machine_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MachineRetrieveResponse, ApiError>
    {
        info!("machine_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List move meta ailments
    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveAilmentListResponse, ApiError>
    {
        info!("move_ailment_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List move battle styles
    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveBattleStyleListResponse, ApiError>
    {
        info!("move_battle_style_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List move meta categories
    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveCategoryListResponse, ApiError>
    {
        info!("move_category_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List move learn methods
    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveLearnMethodListResponse, ApiError>
    {
        info!("move_learn_method_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List moves
    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveListResponse, ApiError>
    {
        info!("move_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List move targets
    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveTargetListResponse, ApiError>
    {
        info!("move_target_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move meta ailment
    async fn move_ailment_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveAilmentRetrieveResponse, ApiError>
    {
        info!("move_ailment_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move battle style
    async fn move_battle_style_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveBattleStyleRetrieveResponse, ApiError>
    {
        info!("move_battle_style_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move meta category
    async fn move_category_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveCategoryRetrieveResponse, ApiError>
    {
        info!("move_category_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move learn method
    async fn move_learn_method_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveLearnMethodRetrieveResponse, ApiError>
    {
        info!("move_learn_method_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move
    async fn move_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveRetrieveResponse, ApiError>
    {
        info!("move_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move target
    async fn move_target_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveTargetRetrieveResponse, ApiError>
    {
        info!("move_target_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<AbilityListResponse, ApiError>
    {
        info!("ability_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List charecterictics
    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<CharacteristicListResponse, ApiError>
    {
        info!("characteristic_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List egg groups
    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EggGroupListResponse, ApiError>
    {
        info!("egg_group_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List genders
    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<GenderListResponse, ApiError>
    {
        info!("gender_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List growth rates
    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<GrowthRateListResponse, ApiError>
    {
        info!("growth_rate_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List move damage classes
    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveDamageClassListResponse, ApiError>
    {
        info!("move_damage_class_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List natures
    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<NatureListResponse, ApiError>
    {
        info!("nature_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokeathlon stats
    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokeathlonStatListResponse, ApiError>
    {
        info!("pokeathlon_stat_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokemon colors
    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonColorListResponse, ApiError>
    {
        info!("pokemon_color_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokemon forms
    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonFormListResponse, ApiError>
    {
        info!("pokemon_form_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokemom habitas
    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonHabitatListResponse, ApiError>
    {
        info!("pokemon_habitat_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokemon
    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonListResponse, ApiError>
    {
        info!("pokemon_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokemon shapes
    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonShapeListResponse, ApiError>
    {
        info!("pokemon_shape_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List pokemon species
    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonSpeciesListResponse, ApiError>
    {
        info!("pokemon_species_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List stats
    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<StatListResponse, ApiError>
    {
        info!("stat_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List types
    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<TypeListResponse, ApiError>
    {
        info!("type_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn ability_retrieve(
        &self,
        id: String,
        context: &C) -> Result<AbilityRetrieveResponse, ApiError>
    {
        info!("ability_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get characteristic
    async fn characteristic_retrieve(
        &self,
        id: String,
        context: &C) -> Result<CharacteristicRetrieveResponse, ApiError>
    {
        info!("characteristic_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get egg group
    async fn egg_group_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EggGroupRetrieveResponse, ApiError>
    {
        info!("egg_group_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get gender
    async fn gender_retrieve(
        &self,
        id: String,
        context: &C) -> Result<GenderRetrieveResponse, ApiError>
    {
        info!("gender_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get growth rate
    async fn growth_rate_retrieve(
        &self,
        id: String,
        context: &C) -> Result<GrowthRateRetrieveResponse, ApiError>
    {
        info!("growth_rate_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get move damage class
    async fn move_damage_class_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveDamageClassRetrieveResponse, ApiError>
    {
        info!("move_damage_class_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get nature
    async fn nature_retrieve(
        &self,
        id: String,
        context: &C) -> Result<NatureRetrieveResponse, ApiError>
    {
        info!("nature_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokeathlon stat
    async fn pokeathlon_stat_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokeathlonStatRetrieveResponse, ApiError>
    {
        info!("pokeathlon_stat_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemon color
    async fn pokemon_color_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonColorRetrieveResponse, ApiError>
    {
        info!("pokemon_color_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemon form
    async fn pokemon_form_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonFormRetrieveResponse, ApiError>
    {
        info!("pokemon_form_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemom habita
    async fn pokemon_habitat_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonHabitatRetrieveResponse, ApiError>
    {
        info!("pokemon_habitat_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemon
    async fn pokemon_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonRetrieveResponse, ApiError>
    {
        info!("pokemon_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemon shape
    async fn pokemon_shape_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonShapeRetrieveResponse, ApiError>
    {
        info!("pokemon_shape_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pokemon species
    async fn pokemon_species_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonSpeciesRetrieveResponse, ApiError>
    {
        info!("pokemon_species_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get stat
    async fn stat_retrieve(
        &self,
        id: String,
        context: &C) -> Result<StatRetrieveResponse, ApiError>
    {
        info!("stat_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get types
    async fn type_retrieve(
        &self,
        id: String,
        context: &C) -> Result<TypeRetrieveResponse, ApiError>
    {
        info!("type_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List languages
    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<LanguageListResponse, ApiError>
    {
        info!("language_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, offset, q, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get language
    async fn language_retrieve(
        &self,
        id: String,
        context: &C) -> Result<LanguageRetrieveResponse, ApiError>
    {
        info!("language_retrieve(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
