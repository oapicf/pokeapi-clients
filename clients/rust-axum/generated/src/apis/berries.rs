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
pub enum BerryFirmnessListResponse {

    Status200
    (models::PaginatedBerryFirmnessSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFirmnessRetrieveResponse {

    Status200
    (models::BerryFirmnessDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFlavorListResponse {

    Status200
    (models::PaginatedBerryFlavorSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFlavorRetrieveResponse {

    Status200
    (models::BerryFlavorDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryListResponse {

    Status200
    (models::PaginatedBerrySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryRetrieveResponse {

    Status200
    (models::BerryDetail)
}




/// Berries
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Berries<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List berry firmness.
    ///
    /// BerryFirmnessList - GET /api/v2/berry-firmness/
    async fn berry_firmness_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::BerryFirmnessListQueryParams,
    ) -> Result<BerryFirmnessListResponse, E>;

    /// Get berry by firmness.
    ///
    /// BerryFirmnessRetrieve - GET /api/v2/berry-firmness/{id}/
    async fn berry_firmness_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::BerryFirmnessRetrievePathParams,
    ) -> Result<BerryFirmnessRetrieveResponse, E>;

    /// List berry flavors.
    ///
    /// BerryFlavorList - GET /api/v2/berry-flavor/
    async fn berry_flavor_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::BerryFlavorListQueryParams,
    ) -> Result<BerryFlavorListResponse, E>;

    /// Get berries by flavor.
    ///
    /// BerryFlavorRetrieve - GET /api/v2/berry-flavor/{id}/
    async fn berry_flavor_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::BerryFlavorRetrievePathParams,
    ) -> Result<BerryFlavorRetrieveResponse, E>;

    /// List berries.
    ///
    /// BerryList - GET /api/v2/berry/
    async fn berry_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::BerryListQueryParams,
    ) -> Result<BerryListResponse, E>;

    /// Get a berry.
    ///
    /// BerryRetrieve - GET /api/v2/berry/{id}/
    async fn berry_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::BerryRetrievePathParams,
    ) -> Result<BerryRetrieveResponse, E>;
}
