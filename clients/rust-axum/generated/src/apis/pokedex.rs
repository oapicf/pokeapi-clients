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
pub enum PokedexListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokedexReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Pokedex
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Pokedex {
    /// PokedexList - GET /api/v2/pokedex/
    async fn pokedex_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::PokedexListQueryParams,
    ) -> Result<PokedexListResponse, String>;

    /// PokedexRead - GET /api/v2/pokedex/{id}/
    async fn pokedex_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PokedexReadPathParams,
    ) -> Result<PokedexReadResponse, String>;
}
