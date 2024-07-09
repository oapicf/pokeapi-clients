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
pub enum ItemFlingEffectListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemFlingEffectReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// ItemFlingEffect
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ItemFlingEffect {
    /// ItemFlingEffectList - GET /api/v2/item-fling-effect/
    async fn item_fling_effect_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ItemFlingEffectListQueryParams,
    ) -> Result<ItemFlingEffectListResponse, String>;

    /// ItemFlingEffectRead - GET /api/v2/item-fling-effect/{id}/
    async fn item_fling_effect_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ItemFlingEffectReadPathParams,
    ) -> Result<ItemFlingEffectReadResponse, String>;
}
