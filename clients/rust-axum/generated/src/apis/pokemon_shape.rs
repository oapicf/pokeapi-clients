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
pub enum PokemonShapeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonShapeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// PokemonShape
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PokemonShape<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// PokemonShapeList - GET /api/v2/pokemon-shape/
    async fn pokemon_shape_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::PokemonShapeListQueryParams,
    ) -> Result<PokemonShapeListResponse, E>;

    /// PokemonShapeRead - GET /api/v2/pokemon-shape/{id}/
    async fn pokemon_shape_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PokemonShapeReadPathParams,
    ) -> Result<PokemonShapeReadResponse, E>;
}
