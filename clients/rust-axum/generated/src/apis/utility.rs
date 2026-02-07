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
pub enum LanguageListResponse {

    Status200
    (models::PaginatedLanguageSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LanguageRetrieveResponse {

    Status200
    (models::LanguageDetail)
}




/// Utility
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Utility<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List languages.
    ///
    /// LanguageList - GET /api/v2/language/
    async fn language_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::LanguageListQueryParams,
    ) -> Result<LanguageListResponse, E>;

    /// Get language.
    ///
    /// LanguageRetrieve - GET /api/v2/language/{id}/
    async fn language_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::LanguageRetrievePathParams,
    ) -> Result<LanguageRetrieveResponse, E>;
}
