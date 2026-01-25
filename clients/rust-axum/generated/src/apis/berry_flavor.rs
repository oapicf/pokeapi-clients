use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFlavorListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFlavorReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// BerryFlavor
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BerryFlavor<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// BerryFlavorList - GET /api/v2/berry-flavor/
    async fn berry_flavor_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::BerryFlavorListQueryParams,
    ) -> Result<BerryFlavorListResponse, E>;

    /// BerryFlavorRead - GET /api/v2/berry-flavor/{id}/
    async fn berry_flavor_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BerryFlavorReadPathParams,
    ) -> Result<BerryFlavorReadResponse, E>;
}
