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
pub enum EncounterConditionListResponse {

    Status200
    (models::PaginatedEncounterConditionSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionRetrieveResponse {

    Status200
    (models::EncounterConditionDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionValueListResponse {

    Status200
    (models::PaginatedEncounterConditionValueSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionValueRetrieveResponse {

    Status200
    (models::EncounterConditionValueDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterMethodListResponse {

    Status200
    (models::PaginatedEncounterMethodSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterMethodRetrieveResponse {

    Status200
    (models::EncounterMethodDetail)
}




/// Encounters
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Encounters<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List encounter conditions.
    ///
    /// EncounterConditionList - GET /api/v2/encounter-condition/
    async fn encounter_condition_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::EncounterConditionListQueryParams,
    ) -> Result<EncounterConditionListResponse, E>;

    /// Get encounter condition.
    ///
    /// EncounterConditionRetrieve - GET /api/v2/encounter-condition/{id}/
    async fn encounter_condition_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EncounterConditionRetrievePathParams,
    ) -> Result<EncounterConditionRetrieveResponse, E>;

    /// List encounter condition values.
    ///
    /// EncounterConditionValueList - GET /api/v2/encounter-condition-value/
    async fn encounter_condition_value_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::EncounterConditionValueListQueryParams,
    ) -> Result<EncounterConditionValueListResponse, E>;

    /// Get encounter condition value.
    ///
    /// EncounterConditionValueRetrieve - GET /api/v2/encounter-condition-value/{id}/
    async fn encounter_condition_value_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EncounterConditionValueRetrievePathParams,
    ) -> Result<EncounterConditionValueRetrieveResponse, E>;

    /// List encounter methods.
    ///
    /// EncounterMethodList - GET /api/v2/encounter-method/
    async fn encounter_method_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::EncounterMethodListQueryParams,
    ) -> Result<EncounterMethodListResponse, E>;

    /// Get encounter method.
    ///
    /// EncounterMethodRetrieve - GET /api/v2/encounter-method/{id}/
    async fn encounter_method_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EncounterMethodRetrievePathParams,
    ) -> Result<EncounterMethodRetrieveResponse, E>;
}
