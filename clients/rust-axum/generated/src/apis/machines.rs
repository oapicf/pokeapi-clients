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

    Status200
    (models::PaginatedMachineSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MachineRetrieveResponse {

    Status200
    (models::MachineDetail)
}




/// Machines
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Machines<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List machines.
    ///
    /// MachineList - GET /api/v2/machine/
    async fn machine_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MachineListQueryParams,
    ) -> Result<MachineListResponse, E>;

    /// Get machine.
    ///
    /// MachineRetrieve - GET /api/v2/machine/{id}/
    async fn machine_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MachineRetrievePathParams,
    ) -> Result<MachineRetrieveResponse, E>;
}
