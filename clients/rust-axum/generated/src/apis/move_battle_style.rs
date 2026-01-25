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
pub enum MoveBattleStyleListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveBattleStyleReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// MoveBattleStyle
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MoveBattleStyle<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// MoveBattleStyleList - GET /api/v2/move-battle-style/
    async fn move_battle_style_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::MoveBattleStyleListQueryParams,
    ) -> Result<MoveBattleStyleListResponse, E>;

    /// MoveBattleStyleRead - GET /api/v2/move-battle-style/{id}/
    async fn move_battle_style_read(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::MoveBattleStyleReadPathParams,
    ) -> Result<MoveBattleStyleReadResponse, E>;
}
