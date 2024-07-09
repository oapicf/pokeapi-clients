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
pub enum MoveDamageClassListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveDamageClassReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// MoveDamageClass
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MoveDamageClass {
    /// MoveDamageClassList - GET /api/v2/move-damage-class/
    async fn move_damage_class_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MoveDamageClassListQueryParams,
    ) -> Result<MoveDamageClassListResponse, String>;

    /// MoveDamageClassRead - GET /api/v2/move-damage-class/{id}/
    async fn move_damage_class_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::MoveDamageClassReadPathParams,
    ) -> Result<MoveDamageClassReadResponse, String>;
}
