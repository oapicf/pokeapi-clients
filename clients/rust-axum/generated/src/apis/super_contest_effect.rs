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
pub enum SuperContestEffectListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SuperContestEffectReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// SuperContestEffect
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait SuperContestEffect<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// SuperContestEffectList - GET /api/v2/super-contest-effect/
    async fn super_contest_effect_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::SuperContestEffectListQueryParams,
    ) -> Result<SuperContestEffectListResponse, E>;

    /// SuperContestEffectRead - GET /api/v2/super-contest-effect/{id}/
    async fn super_contest_effect_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::SuperContestEffectReadPathParams,
    ) -> Result<SuperContestEffectReadResponse, E>;
}
