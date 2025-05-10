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
pub enum EvolutionTriggerListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionTriggerReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// EvolutionTrigger
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait EvolutionTrigger<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// EvolutionTriggerList - GET /api/v2/evolution-trigger/
    async fn evolution_trigger_list(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::EvolutionTriggerListQueryParams,
    ) -> Result<EvolutionTriggerListResponse, E>;

    /// EvolutionTriggerRead - GET /api/v2/evolution-trigger/{id}/
    async fn evolution_trigger_read(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::EvolutionTriggerReadPathParams,
    ) -> Result<EvolutionTriggerReadResponse, E>;
}
