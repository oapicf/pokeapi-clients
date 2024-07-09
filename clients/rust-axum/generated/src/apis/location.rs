use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Location
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Location {
    /// LocationList - GET /api/v2/location/
    async fn location_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::LocationListQueryParams,
    ) -> Result<LocationListResponse, String>;

    /// LocationRead - GET /api/v2/location/{id}/
    async fn location_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LocationReadPathParams,
    ) -> Result<LocationReadResponse, String>;
}
