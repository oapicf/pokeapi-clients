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
pub enum StatListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum StatReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Stat
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Stat {
    /// StatList - GET /api/v2/stat/
    async fn stat_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::StatListQueryParams,
    ) -> Result<StatListResponse, String>;

    /// StatRead - GET /api/v2/stat/{id}/
    async fn stat_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::StatReadPathParams,
    ) -> Result<StatReadResponse, String>;
}
