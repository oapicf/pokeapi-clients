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
pub enum AbilityListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AbilityReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Ability
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Ability {
    /// AbilityList - GET /api/v2/ability/
    async fn ability_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::AbilityListQueryParams,
    ) -> Result<AbilityListResponse, String>;

    /// AbilityRead - GET /api/v2/ability/{id}/
    async fn ability_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AbilityReadPathParams,
    ) -> Result<AbilityReadResponse, String>;
}
