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
pub enum ContestEffectListResponse {

    Status200
    (models::PaginatedContestEffectSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestEffectRetrieveResponse {

    Status200
    (models::ContestEffectDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestTypeListResponse {

    Status200
    (models::PaginatedContestTypeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestTypeRetrieveResponse {

    Status200
    (models::ContestTypeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SuperContestEffectListResponse {

    Status200
    (models::PaginatedSuperContestEffectSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SuperContestEffectRetrieveResponse {

    Status200
    (models::SuperContestEffectDetail)
}




/// Contests
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Contests<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List contest effects.
    ///
    /// ContestEffectList - GET /api/v2/contest-effect/
    async fn contest_effect_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ContestEffectListQueryParams,
    ) -> Result<ContestEffectListResponse, E>;

    /// Get contest effect.
    ///
    /// ContestEffectRetrieve - GET /api/v2/contest-effect/{id}/
    async fn contest_effect_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ContestEffectRetrievePathParams,
    ) -> Result<ContestEffectRetrieveResponse, E>;

    /// List contest types.
    ///
    /// ContestTypeList - GET /api/v2/contest-type/
    async fn contest_type_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ContestTypeListQueryParams,
    ) -> Result<ContestTypeListResponse, E>;

    /// Get contest type.
    ///
    /// ContestTypeRetrieve - GET /api/v2/contest-type/{id}/
    async fn contest_type_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ContestTypeRetrievePathParams,
    ) -> Result<ContestTypeRetrieveResponse, E>;

    /// List super contest effects.
    ///
    /// SuperContestEffectList - GET /api/v2/super-contest-effect/
    async fn super_contest_effect_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::SuperContestEffectListQueryParams,
    ) -> Result<SuperContestEffectListResponse, E>;

    /// Get super contest effect.
    ///
    /// SuperContestEffectRetrieve - GET /api/v2/super-contest-effect/{id}/
    async fn super_contest_effect_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::SuperContestEffectRetrievePathParams,
    ) -> Result<SuperContestEffectRetrieveResponse, E>;
}
