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
pub enum BerryListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Berry
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Berry<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// BerryList - GET /api/v2/berry/
    async fn berry_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::BerryListQueryParams,
    ) -> Result<BerryListResponse, E>;

    /// BerryRead - GET /api/v2/berry/{id}/
    async fn berry_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BerryReadPathParams,
    ) -> Result<BerryReadResponse, E>;
}
