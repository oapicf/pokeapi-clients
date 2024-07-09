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
pub enum MoveCategoryListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveCategoryReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// MoveCategory
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MoveCategory {
    /// MoveCategoryList - GET /api/v2/move-category/
    async fn move_category_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MoveCategoryListQueryParams,
    ) -> Result<MoveCategoryListResponse, String>;

    /// MoveCategoryRead - GET /api/v2/move-category/{id}/
    async fn move_category_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::MoveCategoryReadPathParams,
    ) -> Result<MoveCategoryReadResponse, String>;
}
