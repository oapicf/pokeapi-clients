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
pub enum MoveAilmentListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveAilmentReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// MoveAilment
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MoveAilment<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// MoveAilmentList - GET /api/v2/move-ailment/
    async fn move_ailment_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::MoveAilmentListQueryParams,
    ) -> Result<MoveAilmentListResponse, E>;

    /// MoveAilmentRead - GET /api/v2/move-ailment/{id}/
    async fn move_ailment_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::MoveAilmentReadPathParams,
    ) -> Result<MoveAilmentReadResponse, E>;
}
