#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, unused_attributes, non_camel_case_types)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
#[cfg(feature = "mock")]
use mockall::automock;
use std::error::Error;
use std::collections::BTreeSet;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper, auth::Authorization};
use serde::{Serialize, Deserialize};

#[cfg(any(feature = "client", feature = "server"))]
type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "";
pub const API_VERSION: &str = "2.7.0";

mod auth;
pub use auth::{AuthenticationApi, Claims};


#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFirmnessListResponse {
    /// 
    Status200
    (models::PaginatedBerryFirmnessSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFlavorListResponse {
    /// 
    Status200
    (models::PaginatedBerryFlavorSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryListResponse {
    /// 
    Status200
    (models::PaginatedBerrySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFirmnessRetrieveResponse {
    /// 
    Status200
    (models::BerryFirmnessDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFlavorRetrieveResponse {
    /// 
    Status200
    (models::BerryFlavorDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryRetrieveResponse {
    /// 
    Status200
    (models::BerryDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestEffectListResponse {
    /// 
    Status200
    (models::PaginatedContestEffectSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestTypeListResponse {
    /// 
    Status200
    (models::PaginatedContestTypeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum SuperContestEffectListResponse {
    /// 
    Status200
    (models::PaginatedSuperContestEffectSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestEffectRetrieveResponse {
    /// 
    Status200
    (models::ContestEffectDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestTypeRetrieveResponse {
    /// 
    Status200
    (models::ContestTypeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum SuperContestEffectRetrieveResponse {
    /// 
    Status200
    (models::SuperContestEffectDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionListResponse {
    /// 
    Status200
    (models::PaginatedEncounterConditionSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionValueListResponse {
    /// 
    Status200
    (models::PaginatedEncounterConditionValueSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterMethodListResponse {
    /// 
    Status200
    (models::PaginatedEncounterMethodSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionRetrieveResponse {
    /// 
    Status200
    (models::EncounterConditionDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionValueRetrieveResponse {
    /// 
    Status200
    (models::EncounterConditionValueDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterMethodRetrieveResponse {
    /// 
    Status200
    (models::EncounterMethodDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionChainListResponse {
    /// 
    Status200
    (models::PaginatedEvolutionChainSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionTriggerListResponse {
    /// 
    Status200
    (models::PaginatedEvolutionTriggerSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionChainRetrieveResponse {
    /// 
    Status200
    (models::EvolutionChainDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionTriggerRetrieveResponse {
    /// 
    Status200
    (models::EvolutionTriggerDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenerationListResponse {
    /// 
    Status200
    (models::PaginatedGenerationSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokedexListResponse {
    /// 
    Status200
    (models::PaginatedPokedexSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionGroupListResponse {
    /// 
    Status200
    (models::PaginatedVersionGroupSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionListResponse {
    /// 
    Status200
    (models::PaginatedVersionSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenerationRetrieveResponse {
    /// 
    Status200
    (models::GenerationDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokedexRetrieveResponse {
    /// 
    Status200
    (models::PokedexDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionGroupRetrieveResponse {
    /// 
    Status200
    (models::VersionGroupDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionRetrieveResponse {
    /// 
    Status200
    (models::VersionDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemAttributeListResponse {
    /// 
    Status200
    (models::PaginatedItemAttributeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemCategoryListResponse {
    /// 
    Status200
    (models::PaginatedItemCategorySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemFlingEffectListResponse {
    /// 
    Status200
    (models::PaginatedItemFlingEffectSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemListResponse {
    /// 
    Status200
    (models::PaginatedItemSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemPocketListResponse {
    /// 
    Status200
    (models::PaginatedItemPocketSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemAttributeRetrieveResponse {
    /// 
    Status200
    (models::ItemAttributeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemCategoryRetrieveResponse {
    /// 
    Status200
    (models::ItemCategoryDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemFlingEffectRetrieveResponse {
    /// 
    Status200
    (models::ItemFlingEffectDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemPocketRetrieveResponse {
    /// 
    Status200
    (models::ItemPocketDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemRetrieveResponse {
    /// 
    Status200
    (models::ItemDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationAreaListResponse {
    /// 
    Status200
    (models::PaginatedLocationAreaSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationListResponse {
    /// 
    Status200
    (models::PaginatedLocationSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PalParkAreaListResponse {
    /// 
    Status200
    (models::PaginatedPalParkAreaSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RegionListResponse {
    /// 
    Status200
    (models::PaginatedRegionSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationAreaRetrieveResponse {
    /// 
    Status200
    (models::LocationAreaDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationRetrieveResponse {
    /// 
    Status200
    (models::LocationDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PalParkAreaRetrieveResponse {
    /// 
    Status200
    (models::PalParkAreaDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RegionRetrieveResponse {
    /// 
    Status200
    (models::RegionDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MachineListResponse {
    /// 
    Status200
    (models::PaginatedMachineSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MachineRetrieveResponse {
    /// 
    Status200
    (models::MachineDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveAilmentListResponse {
    /// 
    Status200
    (models::PaginatedMoveMetaAilmentSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveBattleStyleListResponse {
    /// 
    Status200
    (models::PaginatedMoveBattleStyleSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveCategoryListResponse {
    /// 
    Status200
    (models::PaginatedMoveMetaCategorySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveLearnMethodListResponse {
    /// 
    Status200
    (models::PaginatedMoveLearnMethodSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveListResponse {
    /// 
    Status200
    (models::PaginatedMoveSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveTargetListResponse {
    /// 
    Status200
    (models::PaginatedMoveTargetSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveAilmentRetrieveResponse {
    /// 
    Status200
    (models::MoveMetaAilmentDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveBattleStyleRetrieveResponse {
    /// 
    Status200
    (models::MoveBattleStyleDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveCategoryRetrieveResponse {
    /// 
    Status200
    (models::MoveMetaCategoryDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveLearnMethodRetrieveResponse {
    /// 
    Status200
    (models::MoveLearnMethodDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveRetrieveResponse {
    /// 
    Status200
    (models::MoveDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveTargetRetrieveResponse {
    /// 
    Status200
    (models::MoveTargetDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AbilityListResponse {
    /// 
    Status200
    (models::PaginatedAbilitySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CharacteristicListResponse {
    /// 
    Status200
    (models::PaginatedCharacteristicSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EggGroupListResponse {
    /// 
    Status200
    (models::PaginatedEggGroupSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenderListResponse {
    /// 
    Status200
    (models::PaginatedGenderSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GrowthRateListResponse {
    /// 
    Status200
    (models::PaginatedGrowthRateSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveDamageClassListResponse {
    /// 
    Status200
    (models::PaginatedMoveDamageClassSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum NatureListResponse {
    /// 
    Status200
    (models::PaginatedNatureSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokeathlonStatListResponse {
    /// 
    Status200
    (models::PaginatedPokeathlonStatSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonColorListResponse {
    /// 
    Status200
    (models::PaginatedPokemonColorSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonFormListResponse {
    /// 
    Status200
    (models::PaginatedPokemonFormSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonHabitatListResponse {
    /// 
    Status200
    (models::PaginatedPokemonHabitatSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonListResponse {
    /// 
    Status200
    (models::PaginatedPokemonSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonShapeListResponse {
    /// 
    Status200
    (models::PaginatedPokemonShapeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonSpeciesListResponse {
    /// 
    Status200
    (models::PaginatedPokemonSpeciesSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum StatListResponse {
    /// 
    Status200
    (models::PaginatedStatSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum TypeListResponse {
    /// 
    Status200
    (models::PaginatedTypeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AbilityRetrieveResponse {
    /// 
    Status200
    (models::AbilityDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CharacteristicRetrieveResponse {
    /// 
    Status200
    (models::CharacteristicDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EggGroupRetrieveResponse {
    /// 
    Status200
    (models::EggGroupDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenderRetrieveResponse {
    /// 
    Status200
    (models::GenderDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GrowthRateRetrieveResponse {
    /// 
    Status200
    (models::GrowthRateDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveDamageClassRetrieveResponse {
    /// 
    Status200
    (models::MoveDamageClassDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum NatureRetrieveResponse {
    /// 
    Status200
    (models::NatureDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokeathlonStatRetrieveResponse {
    /// 
    Status200
    (models::PokeathlonStatDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonColorRetrieveResponse {
    /// 
    Status200
    (models::PokemonColorDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonFormRetrieveResponse {
    /// 
    Status200
    (models::PokemonFormDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonHabitatRetrieveResponse {
    /// 
    Status200
    (models::PokemonHabitatDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonRetrieveResponse {
    /// 
    Status200
    (models::PokemonDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonShapeRetrieveResponse {
    /// 
    Status200
    (models::PokemonShapeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonSpeciesRetrieveResponse {
    /// 
    Status200
    (models::PokemonSpeciesDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum StatRetrieveResponse {
    /// 
    Status200
    (models::StatDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum TypeRetrieveResponse {
    /// 
    Status200
    (models::TypeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LanguageListResponse {
    /// 
    Status200
    (models::PaginatedLanguageSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LanguageRetrieveResponse {
    /// 
    Status200
    (models::LanguageDetail)
}

/// API
#[cfg_attr(feature = "mock", automock)]
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    /// List berry firmness
    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<BerryFirmnessListResponse, ApiError>;

    /// List berry flavors
    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<BerryFlavorListResponse, ApiError>;

    /// List berries
    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<BerryListResponse, ApiError>;

    /// Get berry by firmness
    async fn berry_firmness_retrieve(
        &self,
        id: String,
        context: &C) -> Result<BerryFirmnessRetrieveResponse, ApiError>;

    /// Get berries by flavor
    async fn berry_flavor_retrieve(
        &self,
        id: String,
        context: &C) -> Result<BerryFlavorRetrieveResponse, ApiError>;

    /// Get a berry
    async fn berry_retrieve(
        &self,
        id: String,
        context: &C) -> Result<BerryRetrieveResponse, ApiError>;

    /// List contest effects
    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ContestEffectListResponse, ApiError>;

    /// List contest types
    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ContestTypeListResponse, ApiError>;

    /// List super contest effects
    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<SuperContestEffectListResponse, ApiError>;

    /// Get contest effect
    async fn contest_effect_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ContestEffectRetrieveResponse, ApiError>;

    /// Get contest type
    async fn contest_type_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ContestTypeRetrieveResponse, ApiError>;

    /// Get super contest effect
    async fn super_contest_effect_retrieve(
        &self,
        id: String,
        context: &C) -> Result<SuperContestEffectRetrieveResponse, ApiError>;

    /// List encounter conditions
    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EncounterConditionListResponse, ApiError>;

    /// List encounter condition values
    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EncounterConditionValueListResponse, ApiError>;

    /// List encounter methods
    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EncounterMethodListResponse, ApiError>;

    /// Get encounter condition
    async fn encounter_condition_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EncounterConditionRetrieveResponse, ApiError>;

    /// Get encounter condition value
    async fn encounter_condition_value_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EncounterConditionValueRetrieveResponse, ApiError>;

    /// Get encounter method
    async fn encounter_method_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EncounterMethodRetrieveResponse, ApiError>;

    /// List evolution chains
    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EvolutionChainListResponse, ApiError>;

    /// List evolution triggers
    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EvolutionTriggerListResponse, ApiError>;

    /// Get evolution chain
    async fn evolution_chain_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EvolutionChainRetrieveResponse, ApiError>;

    /// Get evolution trigger
    async fn evolution_trigger_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EvolutionTriggerRetrieveResponse, ApiError>;

    /// List genrations
    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<GenerationListResponse, ApiError>;

    /// List pokedex
    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokedexListResponse, ApiError>;

    /// List version groups
    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<VersionGroupListResponse, ApiError>;

    /// List versions
    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<VersionListResponse, ApiError>;

    /// Get genration
    async fn generation_retrieve(
        &self,
        id: String,
        context: &C) -> Result<GenerationRetrieveResponse, ApiError>;

    /// Get pokedex
    async fn pokedex_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokedexRetrieveResponse, ApiError>;

    /// Get version group
    async fn version_group_retrieve(
        &self,
        id: String,
        context: &C) -> Result<VersionGroupRetrieveResponse, ApiError>;

    /// Get version
    async fn version_retrieve(
        &self,
        id: String,
        context: &C) -> Result<VersionRetrieveResponse, ApiError>;

    /// List item attributes
    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemAttributeListResponse, ApiError>;

    /// List item categories
    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemCategoryListResponse, ApiError>;

    /// List item fling effects
    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemFlingEffectListResponse, ApiError>;

    /// List items
    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemListResponse, ApiError>;

    /// List item pockets
    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<ItemPocketListResponse, ApiError>;

    /// Get item attribute
    async fn item_attribute_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemAttributeRetrieveResponse, ApiError>;

    /// Get item category
    async fn item_category_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemCategoryRetrieveResponse, ApiError>;

    /// Get item fling effect
    async fn item_fling_effect_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemFlingEffectRetrieveResponse, ApiError>;

    /// Get item pocket
    async fn item_pocket_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemPocketRetrieveResponse, ApiError>;

    /// Get item
    async fn item_retrieve(
        &self,
        id: String,
        context: &C) -> Result<ItemRetrieveResponse, ApiError>;

    /// List location areas
    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LocationAreaListResponse, ApiError>;

    /// List locations
    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<LocationListResponse, ApiError>;

    /// List pal park areas
    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PalParkAreaListResponse, ApiError>;

    /// List regions
    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<RegionListResponse, ApiError>;

    /// Get location area
    async fn location_area_retrieve(
        &self,
        id: i32,
        context: &C) -> Result<LocationAreaRetrieveResponse, ApiError>;

    /// Get location
    async fn location_retrieve(
        &self,
        id: String,
        context: &C) -> Result<LocationRetrieveResponse, ApiError>;

    /// Get pal park area
    async fn pal_park_area_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PalParkAreaRetrieveResponse, ApiError>;

    /// Get region
    async fn region_retrieve(
        &self,
        id: String,
        context: &C) -> Result<RegionRetrieveResponse, ApiError>;

    /// List machines
    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MachineListResponse, ApiError>;

    /// Get machine
    async fn machine_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MachineRetrieveResponse, ApiError>;

    /// List move meta ailments
    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveAilmentListResponse, ApiError>;

    /// List move battle styles
    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveBattleStyleListResponse, ApiError>;

    /// List move meta categories
    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveCategoryListResponse, ApiError>;

    /// List move learn methods
    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveLearnMethodListResponse, ApiError>;

    /// List moves
    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveListResponse, ApiError>;

    /// List move targets
    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveTargetListResponse, ApiError>;

    /// Get move meta ailment
    async fn move_ailment_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveAilmentRetrieveResponse, ApiError>;

    /// Get move battle style
    async fn move_battle_style_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveBattleStyleRetrieveResponse, ApiError>;

    /// Get move meta category
    async fn move_category_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveCategoryRetrieveResponse, ApiError>;

    /// Get move learn method
    async fn move_learn_method_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveLearnMethodRetrieveResponse, ApiError>;

    /// Get move
    async fn move_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveRetrieveResponse, ApiError>;

    /// Get move target
    async fn move_target_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveTargetRetrieveResponse, ApiError>;

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<AbilityListResponse, ApiError>;

    /// List charecterictics
    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<CharacteristicListResponse, ApiError>;

    /// List egg groups
    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<EggGroupListResponse, ApiError>;

    /// List genders
    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<GenderListResponse, ApiError>;

    /// List growth rates
    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<GrowthRateListResponse, ApiError>;

    /// List move damage classes
    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<MoveDamageClassListResponse, ApiError>;

    /// List natures
    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<NatureListResponse, ApiError>;

    /// List pokeathlon stats
    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokeathlonStatListResponse, ApiError>;

    /// List pokemon colors
    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonColorListResponse, ApiError>;

    /// List pokemon forms
    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonFormListResponse, ApiError>;

    /// List pokemom habitas
    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonHabitatListResponse, ApiError>;

    /// List pokemon
    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonListResponse, ApiError>;

    /// List pokemon shapes
    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonShapeListResponse, ApiError>;

    /// List pokemon species
    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<PokemonSpeciesListResponse, ApiError>;

    /// List stats
    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<StatListResponse, ApiError>;

    /// List types
    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<TypeListResponse, ApiError>;

    async fn ability_retrieve(
        &self,
        id: String,
        context: &C) -> Result<AbilityRetrieveResponse, ApiError>;

    /// Get characteristic
    async fn characteristic_retrieve(
        &self,
        id: String,
        context: &C) -> Result<CharacteristicRetrieveResponse, ApiError>;

    /// Get egg group
    async fn egg_group_retrieve(
        &self,
        id: String,
        context: &C) -> Result<EggGroupRetrieveResponse, ApiError>;

    /// Get gender
    async fn gender_retrieve(
        &self,
        id: String,
        context: &C) -> Result<GenderRetrieveResponse, ApiError>;

    /// Get growth rate
    async fn growth_rate_retrieve(
        &self,
        id: String,
        context: &C) -> Result<GrowthRateRetrieveResponse, ApiError>;

    /// Get move damage class
    async fn move_damage_class_retrieve(
        &self,
        id: String,
        context: &C) -> Result<MoveDamageClassRetrieveResponse, ApiError>;

    /// Get nature
    async fn nature_retrieve(
        &self,
        id: String,
        context: &C) -> Result<NatureRetrieveResponse, ApiError>;

    /// Get pokeathlon stat
    async fn pokeathlon_stat_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokeathlonStatRetrieveResponse, ApiError>;

    /// Get pokemon color
    async fn pokemon_color_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonColorRetrieveResponse, ApiError>;

    /// Get pokemon form
    async fn pokemon_form_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonFormRetrieveResponse, ApiError>;

    /// Get pokemom habita
    async fn pokemon_habitat_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonHabitatRetrieveResponse, ApiError>;

    /// Get pokemon
    async fn pokemon_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonRetrieveResponse, ApiError>;

    /// Get pokemon shape
    async fn pokemon_shape_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonShapeRetrieveResponse, ApiError>;

    /// Get pokemon species
    async fn pokemon_species_retrieve(
        &self,
        id: String,
        context: &C) -> Result<PokemonSpeciesRetrieveResponse, ApiError>;

    /// Get stat
    async fn stat_retrieve(
        &self,
        id: String,
        context: &C) -> Result<StatRetrieveResponse, ApiError>;

    /// Get types
    async fn type_retrieve(
        &self,
        id: String,
        context: &C) -> Result<TypeRetrieveResponse, ApiError>;

    /// List languages
    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        context: &C) -> Result<LanguageListResponse, ApiError>;

    /// Get language
    async fn language_retrieve(
        &self,
        id: String,
        context: &C) -> Result<LanguageRetrieveResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[cfg_attr(feature = "mock", automock)]
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {
    // The std::task::Context struct houses a reference to std::task::Waker with the lifetime <'a>.
    // Adding an anonymous lifetime `'a` to allow mockall to create a mock object with the right lifetimes.
    // This is needed because the compiler is unable to determine the lifetimes on F's trait bound
    // where F is the closure created by mockall. We use higher-rank trait bounds here to get around this.

    fn context(&self) -> &C;

    /// List berry firmness
    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<BerryFirmnessListResponse, ApiError>;

    /// List berry flavors
    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<BerryFlavorListResponse, ApiError>;

    /// List berries
    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<BerryListResponse, ApiError>;

    /// Get berry by firmness
    async fn berry_firmness_retrieve(
        &self,
        id: String,
        ) -> Result<BerryFirmnessRetrieveResponse, ApiError>;

    /// Get berries by flavor
    async fn berry_flavor_retrieve(
        &self,
        id: String,
        ) -> Result<BerryFlavorRetrieveResponse, ApiError>;

    /// Get a berry
    async fn berry_retrieve(
        &self,
        id: String,
        ) -> Result<BerryRetrieveResponse, ApiError>;

    /// List contest effects
    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ContestEffectListResponse, ApiError>;

    /// List contest types
    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ContestTypeListResponse, ApiError>;

    /// List super contest effects
    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<SuperContestEffectListResponse, ApiError>;

    /// Get contest effect
    async fn contest_effect_retrieve(
        &self,
        id: String,
        ) -> Result<ContestEffectRetrieveResponse, ApiError>;

    /// Get contest type
    async fn contest_type_retrieve(
        &self,
        id: String,
        ) -> Result<ContestTypeRetrieveResponse, ApiError>;

    /// Get super contest effect
    async fn super_contest_effect_retrieve(
        &self,
        id: String,
        ) -> Result<SuperContestEffectRetrieveResponse, ApiError>;

    /// List encounter conditions
    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EncounterConditionListResponse, ApiError>;

    /// List encounter condition values
    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EncounterConditionValueListResponse, ApiError>;

    /// List encounter methods
    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EncounterMethodListResponse, ApiError>;

    /// Get encounter condition
    async fn encounter_condition_retrieve(
        &self,
        id: String,
        ) -> Result<EncounterConditionRetrieveResponse, ApiError>;

    /// Get encounter condition value
    async fn encounter_condition_value_retrieve(
        &self,
        id: String,
        ) -> Result<EncounterConditionValueRetrieveResponse, ApiError>;

    /// Get encounter method
    async fn encounter_method_retrieve(
        &self,
        id: String,
        ) -> Result<EncounterMethodRetrieveResponse, ApiError>;

    /// List evolution chains
    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EvolutionChainListResponse, ApiError>;

    /// List evolution triggers
    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EvolutionTriggerListResponse, ApiError>;

    /// Get evolution chain
    async fn evolution_chain_retrieve(
        &self,
        id: String,
        ) -> Result<EvolutionChainRetrieveResponse, ApiError>;

    /// Get evolution trigger
    async fn evolution_trigger_retrieve(
        &self,
        id: String,
        ) -> Result<EvolutionTriggerRetrieveResponse, ApiError>;

    /// List genrations
    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<GenerationListResponse, ApiError>;

    /// List pokedex
    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokedexListResponse, ApiError>;

    /// List version groups
    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<VersionGroupListResponse, ApiError>;

    /// List versions
    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<VersionListResponse, ApiError>;

    /// Get genration
    async fn generation_retrieve(
        &self,
        id: String,
        ) -> Result<GenerationRetrieveResponse, ApiError>;

    /// Get pokedex
    async fn pokedex_retrieve(
        &self,
        id: String,
        ) -> Result<PokedexRetrieveResponse, ApiError>;

    /// Get version group
    async fn version_group_retrieve(
        &self,
        id: String,
        ) -> Result<VersionGroupRetrieveResponse, ApiError>;

    /// Get version
    async fn version_retrieve(
        &self,
        id: String,
        ) -> Result<VersionRetrieveResponse, ApiError>;

    /// List item attributes
    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemAttributeListResponse, ApiError>;

    /// List item categories
    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemCategoryListResponse, ApiError>;

    /// List item fling effects
    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemFlingEffectListResponse, ApiError>;

    /// List items
    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemListResponse, ApiError>;

    /// List item pockets
    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemPocketListResponse, ApiError>;

    /// Get item attribute
    async fn item_attribute_retrieve(
        &self,
        id: String,
        ) -> Result<ItemAttributeRetrieveResponse, ApiError>;

    /// Get item category
    async fn item_category_retrieve(
        &self,
        id: String,
        ) -> Result<ItemCategoryRetrieveResponse, ApiError>;

    /// Get item fling effect
    async fn item_fling_effect_retrieve(
        &self,
        id: String,
        ) -> Result<ItemFlingEffectRetrieveResponse, ApiError>;

    /// Get item pocket
    async fn item_pocket_retrieve(
        &self,
        id: String,
        ) -> Result<ItemPocketRetrieveResponse, ApiError>;

    /// Get item
    async fn item_retrieve(
        &self,
        id: String,
        ) -> Result<ItemRetrieveResponse, ApiError>;

    /// List location areas
    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LocationAreaListResponse, ApiError>;

    /// List locations
    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<LocationListResponse, ApiError>;

    /// List pal park areas
    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PalParkAreaListResponse, ApiError>;

    /// List regions
    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<RegionListResponse, ApiError>;

    /// Get location area
    async fn location_area_retrieve(
        &self,
        id: i32,
        ) -> Result<LocationAreaRetrieveResponse, ApiError>;

    /// Get location
    async fn location_retrieve(
        &self,
        id: String,
        ) -> Result<LocationRetrieveResponse, ApiError>;

    /// Get pal park area
    async fn pal_park_area_retrieve(
        &self,
        id: String,
        ) -> Result<PalParkAreaRetrieveResponse, ApiError>;

    /// Get region
    async fn region_retrieve(
        &self,
        id: String,
        ) -> Result<RegionRetrieveResponse, ApiError>;

    /// List machines
    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MachineListResponse, ApiError>;

    /// Get machine
    async fn machine_retrieve(
        &self,
        id: String,
        ) -> Result<MachineRetrieveResponse, ApiError>;

    /// List move meta ailments
    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveAilmentListResponse, ApiError>;

    /// List move battle styles
    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveBattleStyleListResponse, ApiError>;

    /// List move meta categories
    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveCategoryListResponse, ApiError>;

    /// List move learn methods
    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveLearnMethodListResponse, ApiError>;

    /// List moves
    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveListResponse, ApiError>;

    /// List move targets
    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveTargetListResponse, ApiError>;

    /// Get move meta ailment
    async fn move_ailment_retrieve(
        &self,
        id: String,
        ) -> Result<MoveAilmentRetrieveResponse, ApiError>;

    /// Get move battle style
    async fn move_battle_style_retrieve(
        &self,
        id: String,
        ) -> Result<MoveBattleStyleRetrieveResponse, ApiError>;

    /// Get move meta category
    async fn move_category_retrieve(
        &self,
        id: String,
        ) -> Result<MoveCategoryRetrieveResponse, ApiError>;

    /// Get move learn method
    async fn move_learn_method_retrieve(
        &self,
        id: String,
        ) -> Result<MoveLearnMethodRetrieveResponse, ApiError>;

    /// Get move
    async fn move_retrieve(
        &self,
        id: String,
        ) -> Result<MoveRetrieveResponse, ApiError>;

    /// Get move target
    async fn move_target_retrieve(
        &self,
        id: String,
        ) -> Result<MoveTargetRetrieveResponse, ApiError>;

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<AbilityListResponse, ApiError>;

    /// List charecterictics
    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<CharacteristicListResponse, ApiError>;

    /// List egg groups
    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EggGroupListResponse, ApiError>;

    /// List genders
    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<GenderListResponse, ApiError>;

    /// List growth rates
    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<GrowthRateListResponse, ApiError>;

    /// List move damage classes
    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveDamageClassListResponse, ApiError>;

    /// List natures
    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<NatureListResponse, ApiError>;

    /// List pokeathlon stats
    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokeathlonStatListResponse, ApiError>;

    /// List pokemon colors
    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonColorListResponse, ApiError>;

    /// List pokemon forms
    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonFormListResponse, ApiError>;

    /// List pokemom habitas
    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonHabitatListResponse, ApiError>;

    /// List pokemon
    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonListResponse, ApiError>;

    /// List pokemon shapes
    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonShapeListResponse, ApiError>;

    /// List pokemon species
    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonSpeciesListResponse, ApiError>;

    /// List stats
    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<StatListResponse, ApiError>;

    /// List types
    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<TypeListResponse, ApiError>;

    async fn ability_retrieve(
        &self,
        id: String,
        ) -> Result<AbilityRetrieveResponse, ApiError>;

    /// Get characteristic
    async fn characteristic_retrieve(
        &self,
        id: String,
        ) -> Result<CharacteristicRetrieveResponse, ApiError>;

    /// Get egg group
    async fn egg_group_retrieve(
        &self,
        id: String,
        ) -> Result<EggGroupRetrieveResponse, ApiError>;

    /// Get gender
    async fn gender_retrieve(
        &self,
        id: String,
        ) -> Result<GenderRetrieveResponse, ApiError>;

    /// Get growth rate
    async fn growth_rate_retrieve(
        &self,
        id: String,
        ) -> Result<GrowthRateRetrieveResponse, ApiError>;

    /// Get move damage class
    async fn move_damage_class_retrieve(
        &self,
        id: String,
        ) -> Result<MoveDamageClassRetrieveResponse, ApiError>;

    /// Get nature
    async fn nature_retrieve(
        &self,
        id: String,
        ) -> Result<NatureRetrieveResponse, ApiError>;

    /// Get pokeathlon stat
    async fn pokeathlon_stat_retrieve(
        &self,
        id: String,
        ) -> Result<PokeathlonStatRetrieveResponse, ApiError>;

    /// Get pokemon color
    async fn pokemon_color_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonColorRetrieveResponse, ApiError>;

    /// Get pokemon form
    async fn pokemon_form_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonFormRetrieveResponse, ApiError>;

    /// Get pokemom habita
    async fn pokemon_habitat_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonHabitatRetrieveResponse, ApiError>;

    /// Get pokemon
    async fn pokemon_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonRetrieveResponse, ApiError>;

    /// Get pokemon shape
    async fn pokemon_shape_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonShapeRetrieveResponse, ApiError>;

    /// Get pokemon species
    async fn pokemon_species_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonSpeciesRetrieveResponse, ApiError>;

    /// Get stat
    async fn stat_retrieve(
        &self,
        id: String,
        ) -> Result<StatRetrieveResponse, ApiError>;

    /// Get types
    async fn type_retrieve(
        &self,
        id: String,
        ) -> Result<TypeRetrieveResponse, ApiError>;

    /// List languages
    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<LanguageListResponse, ApiError>;

    /// Get language
    async fn language_retrieve(
        &self,
        id: String,
        ) -> Result<LanguageRetrieveResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// List berry firmness
    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<BerryFirmnessListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_firmness_list(limit, offset, q, &context).await
    }

    /// List berry flavors
    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<BerryFlavorListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_flavor_list(limit, offset, q, &context).await
    }

    /// List berries
    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<BerryListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_list(limit, offset, q, &context).await
    }

    /// Get berry by firmness
    async fn berry_firmness_retrieve(
        &self,
        id: String,
        ) -> Result<BerryFirmnessRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_firmness_retrieve(id, &context).await
    }

    /// Get berries by flavor
    async fn berry_flavor_retrieve(
        &self,
        id: String,
        ) -> Result<BerryFlavorRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_flavor_retrieve(id, &context).await
    }

    /// Get a berry
    async fn berry_retrieve(
        &self,
        id: String,
        ) -> Result<BerryRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_retrieve(id, &context).await
    }

    /// List contest effects
    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ContestEffectListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_effect_list(limit, offset, q, &context).await
    }

    /// List contest types
    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ContestTypeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_type_list(limit, offset, q, &context).await
    }

    /// List super contest effects
    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<SuperContestEffectListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().super_contest_effect_list(limit, offset, q, &context).await
    }

    /// Get contest effect
    async fn contest_effect_retrieve(
        &self,
        id: String,
        ) -> Result<ContestEffectRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_effect_retrieve(id, &context).await
    }

    /// Get contest type
    async fn contest_type_retrieve(
        &self,
        id: String,
        ) -> Result<ContestTypeRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_type_retrieve(id, &context).await
    }

    /// Get super contest effect
    async fn super_contest_effect_retrieve(
        &self,
        id: String,
        ) -> Result<SuperContestEffectRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().super_contest_effect_retrieve(id, &context).await
    }

    /// List encounter conditions
    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EncounterConditionListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_list(limit, offset, q, &context).await
    }

    /// List encounter condition values
    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EncounterConditionValueListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_value_list(limit, offset, q, &context).await
    }

    /// List encounter methods
    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EncounterMethodListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_method_list(limit, offset, q, &context).await
    }

    /// Get encounter condition
    async fn encounter_condition_retrieve(
        &self,
        id: String,
        ) -> Result<EncounterConditionRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_retrieve(id, &context).await
    }

    /// Get encounter condition value
    async fn encounter_condition_value_retrieve(
        &self,
        id: String,
        ) -> Result<EncounterConditionValueRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_value_retrieve(id, &context).await
    }

    /// Get encounter method
    async fn encounter_method_retrieve(
        &self,
        id: String,
        ) -> Result<EncounterMethodRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_method_retrieve(id, &context).await
    }

    /// List evolution chains
    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EvolutionChainListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_chain_list(limit, offset, q, &context).await
    }

    /// List evolution triggers
    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EvolutionTriggerListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_trigger_list(limit, offset, q, &context).await
    }

    /// Get evolution chain
    async fn evolution_chain_retrieve(
        &self,
        id: String,
        ) -> Result<EvolutionChainRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_chain_retrieve(id, &context).await
    }

    /// Get evolution trigger
    async fn evolution_trigger_retrieve(
        &self,
        id: String,
        ) -> Result<EvolutionTriggerRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_trigger_retrieve(id, &context).await
    }

    /// List genrations
    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<GenerationListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generation_list(limit, offset, q, &context).await
    }

    /// List pokedex
    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokedexListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokedex_list(limit, offset, q, &context).await
    }

    /// List version groups
    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<VersionGroupListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_group_list(limit, offset, q, &context).await
    }

    /// List versions
    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<VersionListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_list(limit, offset, q, &context).await
    }

    /// Get genration
    async fn generation_retrieve(
        &self,
        id: String,
        ) -> Result<GenerationRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generation_retrieve(id, &context).await
    }

    /// Get pokedex
    async fn pokedex_retrieve(
        &self,
        id: String,
        ) -> Result<PokedexRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokedex_retrieve(id, &context).await
    }

    /// Get version group
    async fn version_group_retrieve(
        &self,
        id: String,
        ) -> Result<VersionGroupRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_group_retrieve(id, &context).await
    }

    /// Get version
    async fn version_retrieve(
        &self,
        id: String,
        ) -> Result<VersionRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_retrieve(id, &context).await
    }

    /// List item attributes
    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemAttributeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_attribute_list(limit, offset, q, &context).await
    }

    /// List item categories
    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemCategoryListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_category_list(limit, offset, q, &context).await
    }

    /// List item fling effects
    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemFlingEffectListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_fling_effect_list(limit, offset, q, &context).await
    }

    /// List items
    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_list(limit, offset, q, &context).await
    }

    /// List item pockets
    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<ItemPocketListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_pocket_list(limit, offset, q, &context).await
    }

    /// Get item attribute
    async fn item_attribute_retrieve(
        &self,
        id: String,
        ) -> Result<ItemAttributeRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_attribute_retrieve(id, &context).await
    }

    /// Get item category
    async fn item_category_retrieve(
        &self,
        id: String,
        ) -> Result<ItemCategoryRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_category_retrieve(id, &context).await
    }

    /// Get item fling effect
    async fn item_fling_effect_retrieve(
        &self,
        id: String,
        ) -> Result<ItemFlingEffectRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_fling_effect_retrieve(id, &context).await
    }

    /// Get item pocket
    async fn item_pocket_retrieve(
        &self,
        id: String,
        ) -> Result<ItemPocketRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_pocket_retrieve(id, &context).await
    }

    /// Get item
    async fn item_retrieve(
        &self,
        id: String,
        ) -> Result<ItemRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_retrieve(id, &context).await
    }

    /// List location areas
    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LocationAreaListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_area_list(limit, offset, &context).await
    }

    /// List locations
    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<LocationListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_list(limit, offset, q, &context).await
    }

    /// List pal park areas
    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PalParkAreaListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pal_park_area_list(limit, offset, q, &context).await
    }

    /// List regions
    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<RegionListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().region_list(limit, offset, q, &context).await
    }

    /// Get location area
    async fn location_area_retrieve(
        &self,
        id: i32,
        ) -> Result<LocationAreaRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_area_retrieve(id, &context).await
    }

    /// Get location
    async fn location_retrieve(
        &self,
        id: String,
        ) -> Result<LocationRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_retrieve(id, &context).await
    }

    /// Get pal park area
    async fn pal_park_area_retrieve(
        &self,
        id: String,
        ) -> Result<PalParkAreaRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pal_park_area_retrieve(id, &context).await
    }

    /// Get region
    async fn region_retrieve(
        &self,
        id: String,
        ) -> Result<RegionRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().region_retrieve(id, &context).await
    }

    /// List machines
    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MachineListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().machine_list(limit, offset, q, &context).await
    }

    /// Get machine
    async fn machine_retrieve(
        &self,
        id: String,
        ) -> Result<MachineRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().machine_retrieve(id, &context).await
    }

    /// List move meta ailments
    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveAilmentListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_ailment_list(limit, offset, q, &context).await
    }

    /// List move battle styles
    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveBattleStyleListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_battle_style_list(limit, offset, q, &context).await
    }

    /// List move meta categories
    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveCategoryListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_category_list(limit, offset, q, &context).await
    }

    /// List move learn methods
    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveLearnMethodListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_learn_method_list(limit, offset, q, &context).await
    }

    /// List moves
    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_list(limit, offset, q, &context).await
    }

    /// List move targets
    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveTargetListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_target_list(limit, offset, q, &context).await
    }

    /// Get move meta ailment
    async fn move_ailment_retrieve(
        &self,
        id: String,
        ) -> Result<MoveAilmentRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_ailment_retrieve(id, &context).await
    }

    /// Get move battle style
    async fn move_battle_style_retrieve(
        &self,
        id: String,
        ) -> Result<MoveBattleStyleRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_battle_style_retrieve(id, &context).await
    }

    /// Get move meta category
    async fn move_category_retrieve(
        &self,
        id: String,
        ) -> Result<MoveCategoryRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_category_retrieve(id, &context).await
    }

    /// Get move learn method
    async fn move_learn_method_retrieve(
        &self,
        id: String,
        ) -> Result<MoveLearnMethodRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_learn_method_retrieve(id, &context).await
    }

    /// Get move
    async fn move_retrieve(
        &self,
        id: String,
        ) -> Result<MoveRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_retrieve(id, &context).await
    }

    /// Get move target
    async fn move_target_retrieve(
        &self,
        id: String,
        ) -> Result<MoveTargetRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_target_retrieve(id, &context).await
    }

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<AbilityListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ability_list(limit, offset, q, &context).await
    }

    /// List charecterictics
    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<CharacteristicListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().characteristic_list(limit, offset, q, &context).await
    }

    /// List egg groups
    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<EggGroupListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().egg_group_list(limit, offset, q, &context).await
    }

    /// List genders
    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<GenderListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().gender_list(limit, offset, q, &context).await
    }

    /// List growth rates
    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<GrowthRateListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().growth_rate_list(limit, offset, q, &context).await
    }

    /// List move damage classes
    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<MoveDamageClassListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_damage_class_list(limit, offset, q, &context).await
    }

    /// List natures
    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<NatureListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().nature_list(limit, offset, q, &context).await
    }

    /// List pokeathlon stats
    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokeathlonStatListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokeathlon_stat_list(limit, offset, q, &context).await
    }

    /// List pokemon colors
    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonColorListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_color_list(limit, offset, q, &context).await
    }

    /// List pokemon forms
    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonFormListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_form_list(limit, offset, q, &context).await
    }

    /// List pokemom habitas
    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonHabitatListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_habitat_list(limit, offset, q, &context).await
    }

    /// List pokemon
    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_list(limit, offset, q, &context).await
    }

    /// List pokemon shapes
    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonShapeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_shape_list(limit, offset, q, &context).await
    }

    /// List pokemon species
    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<PokemonSpeciesListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_species_list(limit, offset, q, &context).await
    }

    /// List stats
    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<StatListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().stat_list(limit, offset, q, &context).await
    }

    /// List types
    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<TypeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().type_list(limit, offset, q, &context).await
    }

    async fn ability_retrieve(
        &self,
        id: String,
        ) -> Result<AbilityRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ability_retrieve(id, &context).await
    }

    /// Get characteristic
    async fn characteristic_retrieve(
        &self,
        id: String,
        ) -> Result<CharacteristicRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().characteristic_retrieve(id, &context).await
    }

    /// Get egg group
    async fn egg_group_retrieve(
        &self,
        id: String,
        ) -> Result<EggGroupRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().egg_group_retrieve(id, &context).await
    }

    /// Get gender
    async fn gender_retrieve(
        &self,
        id: String,
        ) -> Result<GenderRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().gender_retrieve(id, &context).await
    }

    /// Get growth rate
    async fn growth_rate_retrieve(
        &self,
        id: String,
        ) -> Result<GrowthRateRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().growth_rate_retrieve(id, &context).await
    }

    /// Get move damage class
    async fn move_damage_class_retrieve(
        &self,
        id: String,
        ) -> Result<MoveDamageClassRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_damage_class_retrieve(id, &context).await
    }

    /// Get nature
    async fn nature_retrieve(
        &self,
        id: String,
        ) -> Result<NatureRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().nature_retrieve(id, &context).await
    }

    /// Get pokeathlon stat
    async fn pokeathlon_stat_retrieve(
        &self,
        id: String,
        ) -> Result<PokeathlonStatRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokeathlon_stat_retrieve(id, &context).await
    }

    /// Get pokemon color
    async fn pokemon_color_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonColorRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_color_retrieve(id, &context).await
    }

    /// Get pokemon form
    async fn pokemon_form_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonFormRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_form_retrieve(id, &context).await
    }

    /// Get pokemom habita
    async fn pokemon_habitat_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonHabitatRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_habitat_retrieve(id, &context).await
    }

    /// Get pokemon
    async fn pokemon_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_retrieve(id, &context).await
    }

    /// Get pokemon shape
    async fn pokemon_shape_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonShapeRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_shape_retrieve(id, &context).await
    }

    /// Get pokemon species
    async fn pokemon_species_retrieve(
        &self,
        id: String,
        ) -> Result<PokemonSpeciesRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_species_retrieve(id, &context).await
    }

    /// Get stat
    async fn stat_retrieve(
        &self,
        id: String,
        ) -> Result<StatRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().stat_retrieve(id, &context).await
    }

    /// Get types
    async fn type_retrieve(
        &self,
        id: String,
        ) -> Result<TypeRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().type_retrieve(id, &context).await
    }

    /// List languages
    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        q: Option<String>,
        ) -> Result<LanguageListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().language_list(limit, offset, q, &context).await
    }

    /// Get language
    async fn language_retrieve(
        &self,
        id: String,
        ) -> Result<LanguageRetrieveResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().language_retrieve(id, &context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
