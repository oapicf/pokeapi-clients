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
pub enum PokemonColorListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonColorReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// PokemonColor
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PokemonColor<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// PokemonColorList - GET /api/v2/pokemon-color/
    async fn pokemon_color_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::PokemonColorListQueryParams,
    ) -> Result<PokemonColorListResponse, E>;

    /// PokemonColorRead - GET /api/v2/pokemon-color/{id}/
    async fn pokemon_color_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PokemonColorReadPathParams,
    ) -> Result<PokemonColorReadResponse, E>;
}
