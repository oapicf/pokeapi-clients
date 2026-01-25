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
pub enum EncounterConditionValueListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionValueReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// EncounterConditionValue
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait EncounterConditionValue<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// EncounterConditionValueList - GET /api/v2/encounter-condition-value/
    async fn encounter_condition_value_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::EncounterConditionValueListQueryParams,
    ) -> Result<EncounterConditionValueListResponse, E>;

    /// EncounterConditionValueRead - GET /api/v2/encounter-condition-value/{id}/
    async fn encounter_condition_value_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::EncounterConditionValueReadPathParams,
    ) -> Result<EncounterConditionValueReadResponse, E>;
}
