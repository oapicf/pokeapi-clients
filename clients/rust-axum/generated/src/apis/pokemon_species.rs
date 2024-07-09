use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonSpeciesListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonSpeciesReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// PokemonSpecies
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PokemonSpecies {
    /// PokemonSpeciesList - GET /api/v2/pokemon-species/
    async fn pokemon_species_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::PokemonSpeciesListQueryParams,
    ) -> Result<PokemonSpeciesListResponse, String>;

    /// PokemonSpeciesRead - GET /api/v2/pokemon-species/{id}/
    async fn pokemon_species_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PokemonSpeciesReadPathParams,
    ) -> Result<PokemonSpeciesReadResponse, String>;
}
