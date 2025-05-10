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
pub enum ContestTypeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestTypeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// ContestType
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ContestType<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// ContestTypeList - GET /api/v2/contest-type/
    async fn contest_type_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ContestTypeListQueryParams,
    ) -> Result<ContestTypeListResponse, E>;

    /// ContestTypeRead - GET /api/v2/contest-type/{id}/
    async fn contest_type_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ContestTypeReadPathParams,
    ) -> Result<ContestTypeReadResponse, E>;
}
