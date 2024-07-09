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
pub enum LanguageListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LanguageReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// Language
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Language {
    /// LanguageList - GET /api/v2/language/
    async fn language_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::LanguageListQueryParams,
    ) -> Result<LanguageListResponse, String>;

    /// LanguageRead - GET /api/v2/language/{id}/
    async fn language_read(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::LanguageReadPathParams,
    ) -> Result<LanguageReadResponse, String>;
}
