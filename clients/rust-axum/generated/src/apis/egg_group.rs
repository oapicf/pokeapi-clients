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
pub enum EggGroupListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EggGroupReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// EggGroup
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait EggGroup<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// EggGroupList - GET /api/v2/egg-group/
    async fn egg_group_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::EggGroupListQueryParams,
    ) -> Result<EggGroupListResponse, E>;

    /// EggGroupRead - GET /api/v2/egg-group/{id}/
    async fn egg_group_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::EggGroupReadPathParams,
    ) -> Result<EggGroupReadResponse, E>;
}
