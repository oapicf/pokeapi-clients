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
pub enum PokemonHabitatListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonHabitatReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// PokemonHabitat
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PokemonHabitat<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// PokemonHabitatList - GET /api/v2/pokemon-habitat/
    async fn pokemon_habitat_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::PokemonHabitatListQueryParams,
    ) -> Result<PokemonHabitatListResponse, E>;

    /// PokemonHabitatRead - GET /api/v2/pokemon-habitat/{id}/
    async fn pokemon_habitat_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PokemonHabitatReadPathParams,
    ) -> Result<PokemonHabitatReadResponse, E>;
}
