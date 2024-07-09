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
pub enum NatureListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NatureReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Nature
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Nature {
    /// NatureList - GET /api/v2/nature/
    async fn nature_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::NatureListQueryParams,
    ) -> Result<NatureListResponse, String>;

    /// NatureRead - GET /api/v2/nature/{id}/
    async fn nature_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::NatureReadPathParams,
    ) -> Result<NatureReadResponse, String>;
}
