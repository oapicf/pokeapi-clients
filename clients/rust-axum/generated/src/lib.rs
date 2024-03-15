#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use types::*;

pub const BASE_PATH: &str = "";
pub const API_VERSION: &str = "20220523";

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AbilityListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AbilityReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFirmnessListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFirmnessReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFlavorListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BerryFlavorReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CharacteristicListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CharacteristicReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestEffectListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestEffectReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestTypeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ContestTypeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EggGroupListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EggGroupReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

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

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionValueListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterConditionValueReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterMethodListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EncounterMethodReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionChainListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionChainReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionTriggerListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EvolutionTriggerReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenderListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenderReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenerationListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenerationReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GrowthRateListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GrowthRateReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemAttributeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemAttributeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemCategoryListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemCategoryReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemFlingEffectListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemFlingEffectReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemPocketListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemPocketReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

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

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationAreaListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LocationAreaReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MachineListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MachineReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveAilmentListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveAilmentReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

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

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveCategoryListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveCategoryReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

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

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveLearnMethodListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveLearnMethodReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveTargetListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveTargetReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NatureListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NatureReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PalParkAreaListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PalParkAreaReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokeathlonStatListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokeathlonStatReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokedexListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokedexReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonColorListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonColorReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonFormListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonFormReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonHabitatListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonHabitatReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonShapeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonShapeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonSpeciesListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonSpeciesReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RegionListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RegionReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum StatListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum StatReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SuperContestEffectListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SuperContestEffectReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TypeListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TypeReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionGroupListResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VersionGroupReadResponse {
    /// Default response
    Status0_DefaultResponse
    (String)
}


/// API
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Api {

                /// AbilityList - GET /api/v2/ability/
                async fn ability_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::AbilityListQueryParams,
                ) -> Result<AbilityListResponse, String>;


                /// AbilityRead - GET /api/v2/ability/{id}/
                async fn ability_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::AbilityReadPathParams,
                ) -> Result<AbilityReadResponse, String>;


                /// BerryList - GET /api/v2/berry/
                async fn berry_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::BerryListQueryParams,
                ) -> Result<BerryListResponse, String>;


                /// BerryRead - GET /api/v2/berry/{id}/
                async fn berry_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BerryReadPathParams,
                ) -> Result<BerryReadResponse, String>;


                /// BerryFirmnessList - GET /api/v2/berry-firmness/
                async fn berry_firmness_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::BerryFirmnessListQueryParams,
                ) -> Result<BerryFirmnessListResponse, String>;


                /// BerryFirmnessRead - GET /api/v2/berry-firmness/{id}/
                async fn berry_firmness_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BerryFirmnessReadPathParams,
                ) -> Result<BerryFirmnessReadResponse, String>;


                /// BerryFlavorList - GET /api/v2/berry-flavor/
                async fn berry_flavor_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::BerryFlavorListQueryParams,
                ) -> Result<BerryFlavorListResponse, String>;


                /// BerryFlavorRead - GET /api/v2/berry-flavor/{id}/
                async fn berry_flavor_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::BerryFlavorReadPathParams,
                ) -> Result<BerryFlavorReadResponse, String>;


                /// CharacteristicList - GET /api/v2/characteristic/
                async fn characteristic_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::CharacteristicListQueryParams,
                ) -> Result<CharacteristicListResponse, String>;


                /// CharacteristicRead - GET /api/v2/characteristic/{id}/
                async fn characteristic_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CharacteristicReadPathParams,
                ) -> Result<CharacteristicReadResponse, String>;


                /// ContestEffectList - GET /api/v2/contest-effect/
                async fn contest_effect_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ContestEffectListQueryParams,
                ) -> Result<ContestEffectListResponse, String>;


                /// ContestEffectRead - GET /api/v2/contest-effect/{id}/
                async fn contest_effect_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ContestEffectReadPathParams,
                ) -> Result<ContestEffectReadResponse, String>;


                /// ContestTypeList - GET /api/v2/contest-type/
                async fn contest_type_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ContestTypeListQueryParams,
                ) -> Result<ContestTypeListResponse, String>;


                /// ContestTypeRead - GET /api/v2/contest-type/{id}/
                async fn contest_type_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ContestTypeReadPathParams,
                ) -> Result<ContestTypeReadResponse, String>;


                /// EggGroupList - GET /api/v2/egg-group/
                async fn egg_group_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::EggGroupListQueryParams,
                ) -> Result<EggGroupListResponse, String>;


                /// EggGroupRead - GET /api/v2/egg-group/{id}/
                async fn egg_group_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::EggGroupReadPathParams,
                ) -> Result<EggGroupReadResponse, String>;


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


                /// EncounterConditionValueList - GET /api/v2/encounter-condition-value/
                async fn encounter_condition_value_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::EncounterConditionValueListQueryParams,
                ) -> Result<EncounterConditionValueListResponse, String>;


                /// EncounterConditionValueRead - GET /api/v2/encounter-condition-value/{id}/
                async fn encounter_condition_value_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::EncounterConditionValueReadPathParams,
                ) -> Result<EncounterConditionValueReadResponse, String>;


                /// EncounterMethodList - GET /api/v2/encounter-method/
                async fn encounter_method_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::EncounterMethodListQueryParams,
                ) -> Result<EncounterMethodListResponse, String>;


                /// EncounterMethodRead - GET /api/v2/encounter-method/{id}/
                async fn encounter_method_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::EncounterMethodReadPathParams,
                ) -> Result<EncounterMethodReadResponse, String>;


                /// EvolutionChainList - GET /api/v2/evolution-chain/
                async fn evolution_chain_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::EvolutionChainListQueryParams,
                ) -> Result<EvolutionChainListResponse, String>;


                /// EvolutionChainRead - GET /api/v2/evolution-chain/{id}/
                async fn evolution_chain_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::EvolutionChainReadPathParams,
                ) -> Result<EvolutionChainReadResponse, String>;


                /// EvolutionTriggerList - GET /api/v2/evolution-trigger/
                async fn evolution_trigger_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::EvolutionTriggerListQueryParams,
                ) -> Result<EvolutionTriggerListResponse, String>;


                /// EvolutionTriggerRead - GET /api/v2/evolution-trigger/{id}/
                async fn evolution_trigger_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::EvolutionTriggerReadPathParams,
                ) -> Result<EvolutionTriggerReadResponse, String>;


                /// GenderList - GET /api/v2/gender/
                async fn gender_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::GenderListQueryParams,
                ) -> Result<GenderListResponse, String>;


                /// GenderRead - GET /api/v2/gender/{id}/
                async fn gender_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GenderReadPathParams,
                ) -> Result<GenderReadResponse, String>;


                /// GenerationList - GET /api/v2/generation/
                async fn generation_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::GenerationListQueryParams,
                ) -> Result<GenerationListResponse, String>;


                /// GenerationRead - GET /api/v2/generation/{id}/
                async fn generation_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GenerationReadPathParams,
                ) -> Result<GenerationReadResponse, String>;


                /// GrowthRateList - GET /api/v2/growth-rate/
                async fn growth_rate_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::GrowthRateListQueryParams,
                ) -> Result<GrowthRateListResponse, String>;


                /// GrowthRateRead - GET /api/v2/growth-rate/{id}/
                async fn growth_rate_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GrowthRateReadPathParams,
                ) -> Result<GrowthRateReadResponse, String>;


                /// ItemList - GET /api/v2/item/
                async fn item_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemListQueryParams,
                ) -> Result<ItemListResponse, String>;


                /// ItemRead - GET /api/v2/item/{id}/
                async fn item_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemReadPathParams,
                ) -> Result<ItemReadResponse, String>;


                /// ItemAttributeList - GET /api/v2/item-attribute/
                async fn item_attribute_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemAttributeListQueryParams,
                ) -> Result<ItemAttributeListResponse, String>;


                /// ItemAttributeRead - GET /api/v2/item-attribute/{id}/
                async fn item_attribute_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemAttributeReadPathParams,
                ) -> Result<ItemAttributeReadResponse, String>;


                /// ItemCategoryList - GET /api/v2/item-category/
                async fn item_category_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemCategoryListQueryParams,
                ) -> Result<ItemCategoryListResponse, String>;


                /// ItemCategoryRead - GET /api/v2/item-category/{id}/
                async fn item_category_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemCategoryReadPathParams,
                ) -> Result<ItemCategoryReadResponse, String>;


                /// ItemFlingEffectList - GET /api/v2/item-fling-effect/
                async fn item_fling_effect_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemFlingEffectListQueryParams,
                ) -> Result<ItemFlingEffectListResponse, String>;


                /// ItemFlingEffectRead - GET /api/v2/item-fling-effect/{id}/
                async fn item_fling_effect_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemFlingEffectReadPathParams,
                ) -> Result<ItemFlingEffectReadResponse, String>;


                /// ItemPocketList - GET /api/v2/item-pocket/
                async fn item_pocket_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ItemPocketListQueryParams,
                ) -> Result<ItemPocketListResponse, String>;


                /// ItemPocketRead - GET /api/v2/item-pocket/{id}/
                async fn item_pocket_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ItemPocketReadPathParams,
                ) -> Result<ItemPocketReadResponse, String>;


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


                /// LocationList - GET /api/v2/location/
                async fn location_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::LocationListQueryParams,
                ) -> Result<LocationListResponse, String>;


                /// LocationRead - GET /api/v2/location/{id}/
                async fn location_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::LocationReadPathParams,
                ) -> Result<LocationReadResponse, String>;


                /// LocationAreaList - GET /api/v2/location-area/
                async fn location_area_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::LocationAreaListQueryParams,
                ) -> Result<LocationAreaListResponse, String>;


                /// LocationAreaRead - GET /api/v2/location-area/{id}/
                async fn location_area_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::LocationAreaReadPathParams,
                ) -> Result<LocationAreaReadResponse, String>;


                /// MachineList - GET /api/v2/machine/
                async fn machine_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MachineListQueryParams,
                ) -> Result<MachineListResponse, String>;


                /// MachineRead - GET /api/v2/machine/{id}/
                async fn machine_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MachineReadPathParams,
                ) -> Result<MachineReadResponse, String>;


                /// MoveList - GET /api/v2/move/
                async fn move_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MoveListQueryParams,
                ) -> Result<MoveListResponse, String>;


                /// MoveRead - GET /api/v2/move/{id}/
                async fn move_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MoveReadPathParams,
                ) -> Result<MoveReadResponse, String>;


                /// MoveAilmentList - GET /api/v2/move-ailment/
                async fn move_ailment_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MoveAilmentListQueryParams,
                ) -> Result<MoveAilmentListResponse, String>;


                /// MoveAilmentRead - GET /api/v2/move-ailment/{id}/
                async fn move_ailment_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MoveAilmentReadPathParams,
                ) -> Result<MoveAilmentReadResponse, String>;


                /// MoveBattleStyleList - GET /api/v2/move-battle-style/
                async fn move_battle_style_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MoveBattleStyleListQueryParams,
                ) -> Result<MoveBattleStyleListResponse, String>;


                /// MoveBattleStyleRead - GET /api/v2/move-battle-style/{id}/
                async fn move_battle_style_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MoveBattleStyleReadPathParams,
                ) -> Result<MoveBattleStyleReadResponse, String>;


                /// MoveCategoryList - GET /api/v2/move-category/
                async fn move_category_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MoveCategoryListQueryParams,
                ) -> Result<MoveCategoryListResponse, String>;


                /// MoveCategoryRead - GET /api/v2/move-category/{id}/
                async fn move_category_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MoveCategoryReadPathParams,
                ) -> Result<MoveCategoryReadResponse, String>;


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


                /// MoveLearnMethodList - GET /api/v2/move-learn-method/
                async fn move_learn_method_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MoveLearnMethodListQueryParams,
                ) -> Result<MoveLearnMethodListResponse, String>;


                /// MoveLearnMethodRead - GET /api/v2/move-learn-method/{id}/
                async fn move_learn_method_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MoveLearnMethodReadPathParams,
                ) -> Result<MoveLearnMethodReadResponse, String>;


                /// MoveTargetList - GET /api/v2/move-target/
                async fn move_target_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::MoveTargetListQueryParams,
                ) -> Result<MoveTargetListResponse, String>;


                /// MoveTargetRead - GET /api/v2/move-target/{id}/
                async fn move_target_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::MoveTargetReadPathParams,
                ) -> Result<MoveTargetReadResponse, String>;


                /// NatureList - GET /api/v2/nature/
                async fn nature_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::NatureListQueryParams,
                ) -> Result<NatureListResponse, String>;


                /// NatureRead - GET /api/v2/nature/{id}/
                async fn nature_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::NatureReadPathParams,
                ) -> Result<NatureReadResponse, String>;


                /// PalParkAreaList - GET /api/v2/pal-park-area/
                async fn pal_park_area_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PalParkAreaListQueryParams,
                ) -> Result<PalParkAreaListResponse, String>;


                /// PalParkAreaRead - GET /api/v2/pal-park-area/{id}/
                async fn pal_park_area_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PalParkAreaReadPathParams,
                ) -> Result<PalParkAreaReadResponse, String>;


                /// PokeathlonStatList - GET /api/v2/pokeathlon-stat/
                async fn pokeathlon_stat_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokeathlonStatListQueryParams,
                ) -> Result<PokeathlonStatListResponse, String>;


                /// PokeathlonStatRead - GET /api/v2/pokeathlon-stat/{id}/
                async fn pokeathlon_stat_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokeathlonStatReadPathParams,
                ) -> Result<PokeathlonStatReadResponse, String>;


                /// PokedexList - GET /api/v2/pokedex/
                async fn pokedex_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokedexListQueryParams,
                ) -> Result<PokedexListResponse, String>;


                /// PokedexRead - GET /api/v2/pokedex/{id}/
                async fn pokedex_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokedexReadPathParams,
                ) -> Result<PokedexReadResponse, String>;


                /// PokemonList - GET /api/v2/pokemon/
                async fn pokemon_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokemonListQueryParams,
                ) -> Result<PokemonListResponse, String>;


                /// PokemonRead - GET /api/v2/pokemon/{id}/
                async fn pokemon_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokemonReadPathParams,
                ) -> Result<PokemonReadResponse, String>;


                /// PokemonColorList - GET /api/v2/pokemon-color/
                async fn pokemon_color_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokemonColorListQueryParams,
                ) -> Result<PokemonColorListResponse, String>;


                /// PokemonColorRead - GET /api/v2/pokemon-color/{id}/
                async fn pokemon_color_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokemonColorReadPathParams,
                ) -> Result<PokemonColorReadResponse, String>;


                /// PokemonFormList - GET /api/v2/pokemon-form/
                async fn pokemon_form_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokemonFormListQueryParams,
                ) -> Result<PokemonFormListResponse, String>;


                /// PokemonFormRead - GET /api/v2/pokemon-form/{id}/
                async fn pokemon_form_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokemonFormReadPathParams,
                ) -> Result<PokemonFormReadResponse, String>;


                /// PokemonHabitatList - GET /api/v2/pokemon-habitat/
                async fn pokemon_habitat_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokemonHabitatListQueryParams,
                ) -> Result<PokemonHabitatListResponse, String>;


                /// PokemonHabitatRead - GET /api/v2/pokemon-habitat/{id}/
                async fn pokemon_habitat_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokemonHabitatReadPathParams,
                ) -> Result<PokemonHabitatReadResponse, String>;


                /// PokemonShapeList - GET /api/v2/pokemon-shape/
                async fn pokemon_shape_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokemonShapeListQueryParams,
                ) -> Result<PokemonShapeListResponse, String>;


                /// PokemonShapeRead - GET /api/v2/pokemon-shape/{id}/
                async fn pokemon_shape_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokemonShapeReadPathParams,
                ) -> Result<PokemonShapeReadResponse, String>;


                /// PokemonSpeciesList - GET /api/v2/pokemon-species/
                async fn pokemon_species_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::PokemonSpeciesListQueryParams,
                ) -> Result<PokemonSpeciesListResponse, String>;


                /// PokemonSpeciesRead - GET /api/v2/pokemon-species/{id}/
                async fn pokemon_species_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::PokemonSpeciesReadPathParams,
                ) -> Result<PokemonSpeciesReadResponse, String>;


                /// RegionList - GET /api/v2/region/
                async fn region_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::RegionListQueryParams,
                ) -> Result<RegionListResponse, String>;


                /// RegionRead - GET /api/v2/region/{id}/
                async fn region_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::RegionReadPathParams,
                ) -> Result<RegionReadResponse, String>;


                /// StatList - GET /api/v2/stat/
                async fn stat_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::StatListQueryParams,
                ) -> Result<StatListResponse, String>;


                /// StatRead - GET /api/v2/stat/{id}/
                async fn stat_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::StatReadPathParams,
                ) -> Result<StatReadResponse, String>;


                /// SuperContestEffectList - GET /api/v2/super-contest-effect/
                async fn super_contest_effect_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::SuperContestEffectListQueryParams,
                ) -> Result<SuperContestEffectListResponse, String>;


                /// SuperContestEffectRead - GET /api/v2/super-contest-effect/{id}/
                async fn super_contest_effect_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SuperContestEffectReadPathParams,
                ) -> Result<SuperContestEffectReadResponse, String>;


                /// TypeList - GET /api/v2/type/
                async fn type_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::TypeListQueryParams,
                ) -> Result<TypeListResponse, String>;


                /// TypeRead - GET /api/v2/type/{id}/
                async fn type_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::TypeReadPathParams,
                ) -> Result<TypeReadResponse, String>;


                /// VersionList - GET /api/v2/version/
                async fn version_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::VersionListQueryParams,
                ) -> Result<VersionListResponse, String>;


                /// VersionRead - GET /api/v2/version/{id}/
                async fn version_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::VersionReadPathParams,
                ) -> Result<VersionReadResponse, String>;


                /// VersionGroupList - GET /api/v2/version-group/
                async fn version_group_list(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::VersionGroupListQueryParams,
                ) -> Result<VersionGroupListResponse, String>;


                /// VersionGroupRead - GET /api/v2/version-group/{id}/
                async fn version_group_read(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::VersionGroupReadPathParams,
                ) -> Result<VersionGroupReadResponse, String>;

}

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;

#[cfg(feature = "server")]
pub(crate) mod header;
