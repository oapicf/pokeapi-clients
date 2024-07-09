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
pub enum RegionListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RegionReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Region
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Region {
    /// RegionList - GET /api/v2/region/
    async fn region_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::RegionListQueryParams,
    ) -> Result<RegionListResponse, String>;

    /// RegionRead - GET /api/v2/region/{id}/
    async fn region_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::RegionReadPathParams,
    ) -> Result<RegionReadResponse, String>;
}
