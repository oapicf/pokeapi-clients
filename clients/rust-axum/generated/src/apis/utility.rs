use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MetaRetrieveResponse {

    Status200
    (models::PokeapiMetaResponse)
}




/// Utility
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Utility<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// List languages.
    ///
    /// LanguageList - GET /api/v2/language/
    async fn language_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
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
      path_params: &models::LanguageRetrievePathParams,
    ) -> Result<LanguageRetrieveResponse, E>;

    /// Get API metadata.
    ///
    /// MetaRetrieve - GET /api/v2/meta/
    async fn meta_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
    ) -> Result<MetaRetrieveResponse, E>;
}
