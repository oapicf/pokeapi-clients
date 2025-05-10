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
pub enum PokemonListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Pokemon
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Pokemon<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// PokemonList - GET /api/v2/pokemon/
    async fn pokemon_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::PokemonListQueryParams,
    ) -> Result<PokemonListResponse, E>;

    /// PokemonRead - GET /api/v2/pokemon/{id}/
    async fn pokemon_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PokemonReadPathParams,
    ) -> Result<PokemonReadResponse, E>;
}
