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
pub enum ContestEffectListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestEffectReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// ContestEffect
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ContestEffect<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// ContestEffectList - GET /api/v2/contest-effect/
    async fn contest_effect_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ContestEffectListQueryParams,
    ) -> Result<ContestEffectListResponse, E>;

    /// ContestEffectRead - GET /api/v2/contest-effect/{id}/
    async fn contest_effect_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ContestEffectReadPathParams,
    ) -> Result<ContestEffectReadResponse, E>;
}
