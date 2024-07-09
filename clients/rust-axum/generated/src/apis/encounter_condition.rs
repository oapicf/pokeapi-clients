use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// EncounterCondition
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait EncounterCondition {
    /// EncounterConditionList - GET /api/v2/encounter-condition/
    async fn encounter_condition_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::EncounterConditionListQueryParams,
    ) -> Result<EncounterConditionListResponse, String>;

    /// EncounterConditionRead - GET /api/v2/encounter-condition/{id}/
    async fn encounter_condition_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::EncounterConditionReadPathParams,
    ) -> Result<EncounterConditionReadResponse, String>;
}
