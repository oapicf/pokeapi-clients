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
pub enum ItemListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Item
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Item {
    /// ItemList - GET /api/v2/item/
    async fn item_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ItemListQueryParams,
    ) -> Result<ItemListResponse, String>;

    /// ItemRead - GET /api/v2/item/{id}/
    async fn item_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ItemReadPathParams,
    ) -> Result<ItemReadResponse, String>;
}
