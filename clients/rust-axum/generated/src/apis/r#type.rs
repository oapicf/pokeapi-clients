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
pub enum TypeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TypeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// R#type
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait R#type<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// TypeList - GET /api/v2/type/
    async fn type_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::TypeListQueryParams,
    ) -> Result<TypeListResponse, E>;

    /// TypeRead - GET /api/v2/type/{id}/
    async fn type_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::TypeReadPathParams,
    ) -> Result<TypeReadResponse, E>;
}
