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
pub enum LocationAreaListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationAreaReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// LocationArea
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait LocationArea<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// LocationAreaList - GET /api/v2/location-area/
    async fn location_area_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::LocationAreaListQueryParams,
    ) -> Result<LocationAreaListResponse, E>;

    /// LocationAreaRead - GET /api/v2/location-area/{id}/
    async fn location_area_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::LocationAreaReadPathParams,
    ) -> Result<LocationAreaReadResponse, E>;
}
