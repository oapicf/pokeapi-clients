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
pub enum GenerationListResponse {

    Status200
    (models::PaginatedGenerationSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenerationRetrieveResponse {

    Status200
    (models::GenerationDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokedexListResponse {

    Status200
    (models::PaginatedPokedexSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokedexRetrieveResponse {

    Status200
    (models::PokedexDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionGroupListResponse {

    Status200
    (models::PaginatedVersionGroupSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionGroupRetrieveResponse {

    Status200
    (models::VersionGroupDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionListResponse {

    Status200
    (models::PaginatedVersionSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionRetrieveResponse {

    Status200
    (models::VersionDetail)
}




/// Games
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Games<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List genrations.
    ///
    /// GenerationList - GET /api/v2/generation/
    async fn generation_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::GenerationListQueryParams,
    ) -> Result<GenerationListResponse, E>;

    /// Get genration.
    ///
    /// GenerationRetrieve - GET /api/v2/generation/{id}/
    async fn generation_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GenerationRetrievePathParams,
    ) -> Result<GenerationRetrieveResponse, E>;

    /// List pokedex.
    ///
    /// PokedexList - GET /api/v2/pokedex/
    async fn pokedex_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokedexListQueryParams,
    ) -> Result<PokedexListResponse, E>;

    /// Get pokedex.
    ///
    /// PokedexRetrieve - GET /api/v2/pokedex/{id}/
    async fn pokedex_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokedexRetrievePathParams,
    ) -> Result<PokedexRetrieveResponse, E>;

    /// List version groups.
    ///
    /// VersionGroupList - GET /api/v2/version-group/
    async fn version_group_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::VersionGroupListQueryParams,
    ) -> Result<VersionGroupListResponse, E>;

    /// Get version group.
    ///
    /// VersionGroupRetrieve - GET /api/v2/version-group/{id}/
    async fn version_group_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::VersionGroupRetrievePathParams,
    ) -> Result<VersionGroupRetrieveResponse, E>;

    /// List versions.
    ///
    /// VersionList - GET /api/v2/version/
    async fn version_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::VersionListQueryParams,
    ) -> Result<VersionListResponse, E>;

    /// Get version.
    ///
    /// VersionRetrieve - GET /api/v2/version/{id}/
    async fn version_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::VersionRetrievePathParams,
    ) -> Result<VersionRetrieveResponse, E>;
}
