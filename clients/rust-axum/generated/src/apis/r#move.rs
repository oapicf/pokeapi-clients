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
pub enum MoveListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// R#move
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait R#move<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// MoveList - GET /api/v2/move/
    async fn move_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::MoveListQueryParams,
    ) -> Result<MoveListResponse, E>;

    /// MoveRead - GET /api/v2/move/{id}/
    async fn move_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::MoveReadPathParams,
    ) -> Result<MoveReadResponse, E>;
}
