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
pub enum VersionListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Version
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Version {
    /// VersionList - GET /api/v2/version/
    async fn version_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::VersionListQueryParams,
    ) -> Result<VersionListResponse, String>;

    /// VersionRead - GET /api/v2/version/{id}/
    async fn version_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::VersionReadPathParams,
    ) -> Result<VersionReadResponse, String>;
}
