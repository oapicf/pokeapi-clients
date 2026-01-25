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
pub enum VersionGroupListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionGroupReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// VersionGroup
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait VersionGroup<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// VersionGroupList - GET /api/v2/version-group/
    async fn version_group_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::VersionGroupListQueryParams,
    ) -> Result<VersionGroupListResponse, E>;

    /// VersionGroupRead - GET /api/v2/version-group/{id}/
    async fn version_group_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::VersionGroupReadPathParams,
    ) -> Result<VersionGroupReadResponse, E>;
}
