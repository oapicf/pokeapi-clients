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
pub enum BerryFirmnessListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFirmnessReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// BerryFirmness
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait BerryFirmness<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// BerryFirmnessList - GET /api/v2/berry-firmness/
    async fn berry_firmness_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::BerryFirmnessListQueryParams,
    ) -> Result<BerryFirmnessListResponse, E>;

    /// BerryFirmnessRead - GET /api/v2/berry-firmness/{id}/
    async fn berry_firmness_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BerryFirmnessReadPathParams,
    ) -> Result<BerryFirmnessReadResponse, E>;
}
