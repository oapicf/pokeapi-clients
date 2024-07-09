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
pub enum MoveTargetListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveTargetReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// MoveTarget
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MoveTarget {
    /// MoveTargetList - GET /api/v2/move-target/
    async fn move_target_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MoveTargetListQueryParams,
    ) -> Result<MoveTargetListResponse, String>;

    /// MoveTargetRead - GET /api/v2/move-target/{id}/
    async fn move_target_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::MoveTargetReadPathParams,
    ) -> Result<MoveTargetReadResponse, String>;
}
