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
pub enum EvolutionChainListResponse {

    Status200
    (models::PaginatedEvolutionChainSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionChainRetrieveResponse {

    Status200
    (models::EvolutionChainDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionTriggerListResponse {

    Status200
    (models::PaginatedEvolutionTriggerSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionTriggerRetrieveResponse {

    Status200
    (models::EvolutionTriggerDetail)
}




/// Evolution
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Evolution<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List evolution chains.
    ///
    /// EvolutionChainList - GET /api/v2/evolution-chain/
    async fn evolution_chain_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::EvolutionChainListQueryParams,
    ) -> Result<EvolutionChainListResponse, E>;

    /// Get evolution chain.
    ///
    /// EvolutionChainRetrieve - GET /api/v2/evolution-chain/{id}/
    async fn evolution_chain_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EvolutionChainRetrievePathParams,
    ) -> Result<EvolutionChainRetrieveResponse, E>;

    /// List evolution triggers.
    ///
    /// EvolutionTriggerList - GET /api/v2/evolution-trigger/
    async fn evolution_trigger_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::EvolutionTriggerListQueryParams,
    ) -> Result<EvolutionTriggerListResponse, E>;

    /// Get evolution trigger.
    ///
    /// EvolutionTriggerRetrieve - GET /api/v2/evolution-trigger/{id}/
    async fn evolution_trigger_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EvolutionTriggerRetrievePathParams,
    ) -> Result<EvolutionTriggerRetrieveResponse, E>;
}
