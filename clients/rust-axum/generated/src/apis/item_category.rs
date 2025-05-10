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
pub enum ItemCategoryListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemCategoryReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// ItemCategory
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ItemCategory<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// ItemCategoryList - GET /api/v2/item-category/
    async fn item_category_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ItemCategoryListQueryParams,
    ) -> Result<ItemCategoryListResponse, E>;

    /// ItemCategoryRead - GET /api/v2/item-category/{id}/
    async fn item_category_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ItemCategoryReadPathParams,
    ) -> Result<ItemCategoryReadResponse, E>;
}
