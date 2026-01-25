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
pub enum ItemAttributeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemAttributeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// ItemAttribute
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ItemAttribute<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// ItemAttributeList - GET /api/v2/item-attribute/
    async fn item_attribute_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ItemAttributeListQueryParams,
    ) -> Result<ItemAttributeListResponse, E>;

    /// ItemAttributeRead - GET /api/v2/item-attribute/{id}/
    async fn item_attribute_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ItemAttributeReadPathParams,
    ) -> Result<ItemAttributeReadResponse, E>;
}
