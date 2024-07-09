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
pub enum MoveLearnMethodListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveLearnMethodReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// MoveLearnMethod
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MoveLearnMethod {
    /// MoveLearnMethodList - GET /api/v2/move-learn-method/
    async fn move_learn_method_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MoveLearnMethodListQueryParams,
    ) -> Result<MoveLearnMethodListResponse, String>;

    /// MoveLearnMethodRead - GET /api/v2/move-learn-method/{id}/
    async fn move_learn_method_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::MoveLearnMethodReadPathParams,
    ) -> Result<MoveLearnMethodReadResponse, String>;
}
