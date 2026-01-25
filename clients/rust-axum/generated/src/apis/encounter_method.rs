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
pub enum EncounterMethodListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterMethodReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// EncounterMethod
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait EncounterMethod<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// EncounterMethodList - GET /api/v2/encounter-method/
    async fn encounter_method_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::EncounterMethodListQueryParams,
    ) -> Result<EncounterMethodListResponse, E>;

    /// EncounterMethodRead - GET /api/v2/encounter-method/{id}/
    async fn encounter_method_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::EncounterMethodReadPathParams,
    ) -> Result<EncounterMethodReadResponse, E>;
}
