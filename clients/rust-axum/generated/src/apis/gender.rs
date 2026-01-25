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
pub enum GenderListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenderReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Gender
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Gender<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// GenderList - GET /api/v2/gender/
    async fn gender_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::GenderListQueryParams,
    ) -> Result<GenderListResponse, E>;

    /// GenderRead - GET /api/v2/gender/{id}/
    async fn gender_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GenderReadPathParams,
    ) -> Result<GenderReadResponse, E>;
}
