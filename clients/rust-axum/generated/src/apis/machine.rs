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
pub enum MachineListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MachineReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Machine
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Machine<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// MachineList - GET /api/v2/machine/
    async fn machine_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::MachineListQueryParams,
    ) -> Result<MachineListResponse, E>;

    /// MachineRead - GET /api/v2/machine/{id}/
    async fn machine_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::MachineReadPathParams,
    ) -> Result<MachineReadResponse, E>;
}
