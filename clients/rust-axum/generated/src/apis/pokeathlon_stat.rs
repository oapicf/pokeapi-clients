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
pub enum PokeathlonStatListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokeathlonStatReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// PokeathlonStat
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PokeathlonStat<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// PokeathlonStatList - GET /api/v2/pokeathlon-stat/
    async fn pokeathlon_stat_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::PokeathlonStatListQueryParams,
    ) -> Result<PokeathlonStatListResponse, E>;

    /// PokeathlonStatRead - GET /api/v2/pokeathlon-stat/{id}/
    async fn pokeathlon_stat_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PokeathlonStatReadPathParams,
    ) -> Result<PokeathlonStatReadResponse, E>;
}
