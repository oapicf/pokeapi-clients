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
pub enum PalParkAreaListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PalParkAreaReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// PalParkArea
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait PalParkArea {
    /// PalParkAreaList - GET /api/v2/pal-park-area/
    async fn pal_park_area_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::PalParkAreaListQueryParams,
    ) -> Result<PalParkAreaListResponse, String>;

    /// PalParkAreaRead - GET /api/v2/pal-park-area/{id}/
    async fn pal_park_area_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PalParkAreaReadPathParams,
    ) -> Result<PalParkAreaReadResponse, String>;
}
