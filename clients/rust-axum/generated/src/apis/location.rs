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
pub enum LocationAreaListResponse {

    Status200
    (models::PaginatedLocationAreaSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationAreaRetrieveResponse {

    Status200
    (models::LocationAreaDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationListResponse {

    Status200
    (models::PaginatedLocationSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationRetrieveResponse {

    Status200
    (models::LocationDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PalParkAreaListResponse {

    Status200
    (models::PaginatedPalParkAreaSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PalParkAreaRetrieveResponse {

    Status200
    (models::PalParkAreaDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RegionListResponse {

    Status200
    (models::PaginatedRegionSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RegionRetrieveResponse {

    Status200
    (models::RegionDetail)
}




/// Location
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Location<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List location areas.
    ///
    /// LocationAreaList - GET /api/v2/location-area/
    async fn location_area_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::LocationAreaListQueryParams,
    ) -> Result<LocationAreaListResponse, E>;

    /// Get location area.
    ///
    /// LocationAreaRetrieve - GET /api/v2/location-area/{id}/
    async fn location_area_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::LocationAreaRetrievePathParams,
    ) -> Result<LocationAreaRetrieveResponse, E>;

    /// List locations.
    ///
    /// LocationList - GET /api/v2/location/
    async fn location_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::LocationListQueryParams,
    ) -> Result<LocationListResponse, E>;

    /// Get location.
    ///
    /// LocationRetrieve - GET /api/v2/location/{id}/
    async fn location_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::LocationRetrievePathParams,
    ) -> Result<LocationRetrieveResponse, E>;

    /// List pal park areas.
    ///
    /// PalParkAreaList - GET /api/v2/pal-park-area/
    async fn pal_park_area_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PalParkAreaListQueryParams,
    ) -> Result<PalParkAreaListResponse, E>;

    /// Get pal park area.
    ///
    /// PalParkAreaRetrieve - GET /api/v2/pal-park-area/{id}/
    async fn pal_park_area_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PalParkAreaRetrievePathParams,
    ) -> Result<PalParkAreaRetrieveResponse, E>;

    /// List regions.
    ///
    /// RegionList - GET /api/v2/region/
    async fn region_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::RegionListQueryParams,
    ) -> Result<RegionListResponse, E>;

    /// Get region.
    ///
    /// RegionRetrieve - GET /api/v2/region/{id}/
    async fn region_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RegionRetrievePathParams,
    ) -> Result<RegionRetrieveResponse, E>;
}
