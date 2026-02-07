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
pub enum MoveAilmentListResponse {

    Status200
    (models::PaginatedMoveMetaAilmentSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveAilmentRetrieveResponse {

    Status200
    (models::MoveMetaAilmentDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveBattleStyleListResponse {

    Status200
    (models::PaginatedMoveBattleStyleSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveBattleStyleRetrieveResponse {

    Status200
    (models::MoveBattleStyleDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveCategoryListResponse {

    Status200
    (models::PaginatedMoveMetaCategorySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveCategoryRetrieveResponse {

    Status200
    (models::MoveMetaCategoryDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveLearnMethodListResponse {

    Status200
    (models::PaginatedMoveLearnMethodSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveLearnMethodRetrieveResponse {

    Status200
    (models::MoveLearnMethodDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveListResponse {

    Status200
    (models::PaginatedMoveSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveRetrieveResponse {

    Status200
    (models::MoveDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveTargetListResponse {

    Status200
    (models::PaginatedMoveTargetSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveTargetRetrieveResponse {

    Status200
    (models::MoveTargetDetail)
}




/// Moves
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Moves<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List move meta ailments.
    ///
    /// MoveAilmentList - GET /api/v2/move-ailment/
    async fn move_ailment_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveAilmentListQueryParams,
    ) -> Result<MoveAilmentListResponse, E>;

    /// Get move meta ailment.
    ///
    /// MoveAilmentRetrieve - GET /api/v2/move-ailment/{id}/
    async fn move_ailment_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveAilmentRetrievePathParams,
    ) -> Result<MoveAilmentRetrieveResponse, E>;

    /// List move battle styles.
    ///
    /// MoveBattleStyleList - GET /api/v2/move-battle-style/
    async fn move_battle_style_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveBattleStyleListQueryParams,
    ) -> Result<MoveBattleStyleListResponse, E>;

    /// Get move battle style.
    ///
    /// MoveBattleStyleRetrieve - GET /api/v2/move-battle-style/{id}/
    async fn move_battle_style_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveBattleStyleRetrievePathParams,
    ) -> Result<MoveBattleStyleRetrieveResponse, E>;

    /// List move meta categories.
    ///
    /// MoveCategoryList - GET /api/v2/move-category/
    async fn move_category_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveCategoryListQueryParams,
    ) -> Result<MoveCategoryListResponse, E>;

    /// Get move meta category.
    ///
    /// MoveCategoryRetrieve - GET /api/v2/move-category/{id}/
    async fn move_category_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveCategoryRetrievePathParams,
    ) -> Result<MoveCategoryRetrieveResponse, E>;

    /// List move learn methods.
    ///
    /// MoveLearnMethodList - GET /api/v2/move-learn-method/
    async fn move_learn_method_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveLearnMethodListQueryParams,
    ) -> Result<MoveLearnMethodListResponse, E>;

    /// Get move learn method.
    ///
    /// MoveLearnMethodRetrieve - GET /api/v2/move-learn-method/{id}/
    async fn move_learn_method_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveLearnMethodRetrievePathParams,
    ) -> Result<MoveLearnMethodRetrieveResponse, E>;

    /// List moves.
    ///
    /// MoveList - GET /api/v2/move/
    async fn move_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveListQueryParams,
    ) -> Result<MoveListResponse, E>;

    /// Get move.
    ///
    /// MoveRetrieve - GET /api/v2/move/{id}/
    async fn move_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveRetrievePathParams,
    ) -> Result<MoveRetrieveResponse, E>;

    /// List move targets.
    ///
    /// MoveTargetList - GET /api/v2/move-target/
    async fn move_target_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveTargetListQueryParams,
    ) -> Result<MoveTargetListResponse, E>;

    /// Get move target.
    ///
    /// MoveTargetRetrieve - GET /api/v2/move-target/{id}/
    async fn move_target_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveTargetRetrievePathParams,
    ) -> Result<MoveTargetRetrieveResponse, E>;
}
