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
pub enum ContestTypeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestTypeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// ContestType
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ContestType {
    /// ContestTypeList - GET /api/v2/contest-type/
    async fn contest_type_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ContestTypeListQueryParams,
    ) -> Result<ContestTypeListResponse, String>;

    /// ContestTypeRead - GET /api/v2/contest-type/{id}/
    async fn contest_type_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ContestTypeReadPathParams,
    ) -> Result<ContestTypeReadResponse, String>;
}
