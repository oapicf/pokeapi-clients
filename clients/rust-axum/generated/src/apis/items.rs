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

    Status200
    (models::PaginatedItemAttributeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemAttributeRetrieveResponse {

    Status200
    (models::ItemAttributeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemCategoryListResponse {

    Status200
    (models::PaginatedItemCategorySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemCategoryRetrieveResponse {

    Status200
    (models::ItemCategoryDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemFlingEffectListResponse {

    Status200
    (models::PaginatedItemFlingEffectSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemFlingEffectRetrieveResponse {

    Status200
    (models::ItemFlingEffectDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemListResponse {

    Status200
    (models::PaginatedItemSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemPocketListResponse {

    Status200
    (models::PaginatedItemPocketSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemPocketRetrieveResponse {

    Status200
    (models::ItemPocketDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemRetrieveResponse {

    Status200
    (models::ItemDetail)
}




/// Items
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Items<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List item attributes.
    ///
    /// ItemAttributeList - GET /api/v2/item-attribute/
    async fn item_attribute_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ItemAttributeListQueryParams,
    ) -> Result<ItemAttributeListResponse, E>;

    /// Get item attribute.
    ///
    /// ItemAttributeRetrieve - GET /api/v2/item-attribute/{id}/
    async fn item_attribute_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ItemAttributeRetrievePathParams,
    ) -> Result<ItemAttributeRetrieveResponse, E>;

    /// List item categories.
    ///
    /// ItemCategoryList - GET /api/v2/item-category/
    async fn item_category_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ItemCategoryListQueryParams,
    ) -> Result<ItemCategoryListResponse, E>;

    /// Get item category.
    ///
    /// ItemCategoryRetrieve - GET /api/v2/item-category/{id}/
    async fn item_category_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ItemCategoryRetrievePathParams,
    ) -> Result<ItemCategoryRetrieveResponse, E>;

    /// List item fling effects.
    ///
    /// ItemFlingEffectList - GET /api/v2/item-fling-effect/
    async fn item_fling_effect_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ItemFlingEffectListQueryParams,
    ) -> Result<ItemFlingEffectListResponse, E>;

    /// Get item fling effect.
    ///
    /// ItemFlingEffectRetrieve - GET /api/v2/item-fling-effect/{id}/
    async fn item_fling_effect_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ItemFlingEffectRetrievePathParams,
    ) -> Result<ItemFlingEffectRetrieveResponse, E>;

    /// List items.
    ///
    /// ItemList - GET /api/v2/item/
    async fn item_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ItemListQueryParams,
    ) -> Result<ItemListResponse, E>;

    /// List item pockets.
    ///
    /// ItemPocketList - GET /api/v2/item-pocket/
    async fn item_pocket_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ItemPocketListQueryParams,
    ) -> Result<ItemPocketListResponse, E>;

    /// Get item pocket.
    ///
    /// ItemPocketRetrieve - GET /api/v2/item-pocket/{id}/
    async fn item_pocket_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ItemPocketRetrievePathParams,
    ) -> Result<ItemPocketRetrieveResponse, E>;

    /// Get item.
    ///
    /// ItemRetrieve - GET /api/v2/item/{id}/
    async fn item_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ItemRetrievePathParams,
    ) -> Result<ItemRetrieveResponse, E>;
}
