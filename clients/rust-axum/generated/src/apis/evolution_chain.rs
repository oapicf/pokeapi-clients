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
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionChainReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// EvolutionChain
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait EvolutionChain<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// EvolutionChainList - GET /api/v2/evolution-chain/
    async fn evolution_chain_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::EvolutionChainListQueryParams,
    ) -> Result<EvolutionChainListResponse, E>;

    /// EvolutionChainRead - GET /api/v2/evolution-chain/{id}/
    async fn evolution_chain_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::EvolutionChainReadPathParams,
    ) -> Result<EvolutionChainReadResponse, E>;
}
