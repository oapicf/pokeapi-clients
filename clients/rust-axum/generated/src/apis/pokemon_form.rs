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
pub enum PokemonFormListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonFormReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// PokemonForm
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PokemonForm<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// PokemonFormList - GET /api/v2/pokemon-form/
    async fn pokemon_form_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::PokemonFormListQueryParams,
    ) -> Result<PokemonFormListResponse, E>;

    /// PokemonFormRead - GET /api/v2/pokemon-form/{id}/
    async fn pokemon_form_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PokemonFormReadPathParams,
    ) -> Result<PokemonFormReadResponse, E>;
}
