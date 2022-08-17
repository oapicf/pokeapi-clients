#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &'static str = "";
pub const API_VERSION: &'static str = "20220523";

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AbilityListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AbilityReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFirmnessListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFirmnessReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFlavorListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum BerryFlavorReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CharacteristicListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CharacteristicReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestEffectListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestEffectReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestTypeListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ContestTypeReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EggGroupListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EggGroupReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionValueListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterConditionValueReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterMethodListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EncounterMethodReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionChainListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionChainReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionTriggerListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum EvolutionTriggerReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenderListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenderReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenerationListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GenerationReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GrowthRateListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GrowthRateReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemAttributeListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemAttributeReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemCategoryListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemCategoryReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemFlingEffectListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemFlingEffectReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemPocketListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ItemPocketReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LanguageListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LanguageReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationAreaListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum LocationAreaReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MachineListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MachineReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveAilmentListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveAilmentReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveBattleStyleListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveBattleStyleReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveCategoryListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveCategoryReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveDamageClassListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveDamageClassReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveLearnMethodListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveLearnMethodReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveTargetListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum MoveTargetReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum NatureListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum NatureReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PalParkAreaListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PalParkAreaReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokeathlonStatListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokeathlonStatReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokedexListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokedexReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonColorListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonColorReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonFormListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonFormReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonHabitatListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonHabitatReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonShapeListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonShapeReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonSpeciesListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum PokemonSpeciesReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RegionListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RegionReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum StatListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum StatReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum SuperContestEffectListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum SuperContestEffectReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum TypeListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum TypeReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionGroupListResponse {
    /// Default response
    DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum VersionGroupReadResponse {
    /// Default response
    DefaultResponse
    (String)
}

/// API
#[async_trait]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<AbilityListResponse, ApiError>;

    async fn ability_read(
        &self,
        id: i32,
        context: &C) -> Result<AbilityReadResponse, ApiError>;

    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<BerryListResponse, ApiError>;

    async fn berry_read(
        &self,
        id: i32,
        context: &C) -> Result<BerryReadResponse, ApiError>;

    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<BerryFirmnessListResponse, ApiError>;

    async fn berry_firmness_read(
        &self,
        id: i32,
        context: &C) -> Result<BerryFirmnessReadResponse, ApiError>;

    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<BerryFlavorListResponse, ApiError>;

    async fn berry_flavor_read(
        &self,
        id: i32,
        context: &C) -> Result<BerryFlavorReadResponse, ApiError>;

    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<CharacteristicListResponse, ApiError>;

    async fn characteristic_read(
        &self,
        id: i32,
        context: &C) -> Result<CharacteristicReadResponse, ApiError>;

    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ContestEffectListResponse, ApiError>;

    async fn contest_effect_read(
        &self,
        id: i32,
        context: &C) -> Result<ContestEffectReadResponse, ApiError>;

    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ContestTypeListResponse, ApiError>;

    async fn contest_type_read(
        &self,
        id: i32,
        context: &C) -> Result<ContestTypeReadResponse, ApiError>;

    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EggGroupListResponse, ApiError>;

    async fn egg_group_read(
        &self,
        id: i32,
        context: &C) -> Result<EggGroupReadResponse, ApiError>;

    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EncounterConditionListResponse, ApiError>;

    async fn encounter_condition_read(
        &self,
        id: i32,
        context: &C) -> Result<EncounterConditionReadResponse, ApiError>;

    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EncounterConditionValueListResponse, ApiError>;

    async fn encounter_condition_value_read(
        &self,
        id: i32,
        context: &C) -> Result<EncounterConditionValueReadResponse, ApiError>;

    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EncounterMethodListResponse, ApiError>;

    async fn encounter_method_read(
        &self,
        id: i32,
        context: &C) -> Result<EncounterMethodReadResponse, ApiError>;

    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EvolutionChainListResponse, ApiError>;

    async fn evolution_chain_read(
        &self,
        id: i32,
        context: &C) -> Result<EvolutionChainReadResponse, ApiError>;

    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<EvolutionTriggerListResponse, ApiError>;

    async fn evolution_trigger_read(
        &self,
        id: i32,
        context: &C) -> Result<EvolutionTriggerReadResponse, ApiError>;

    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<GenderListResponse, ApiError>;

    async fn gender_read(
        &self,
        id: i32,
        context: &C) -> Result<GenderReadResponse, ApiError>;

    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<GenerationListResponse, ApiError>;

    async fn generation_read(
        &self,
        id: i32,
        context: &C) -> Result<GenerationReadResponse, ApiError>;

    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<GrowthRateListResponse, ApiError>;

    async fn growth_rate_read(
        &self,
        id: i32,
        context: &C) -> Result<GrowthRateReadResponse, ApiError>;

    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemListResponse, ApiError>;

    async fn item_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemReadResponse, ApiError>;

    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemAttributeListResponse, ApiError>;

    async fn item_attribute_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemAttributeReadResponse, ApiError>;

    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemCategoryListResponse, ApiError>;

    async fn item_category_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemCategoryReadResponse, ApiError>;

    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemFlingEffectListResponse, ApiError>;

    async fn item_fling_effect_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemFlingEffectReadResponse, ApiError>;

    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<ItemPocketListResponse, ApiError>;

    async fn item_pocket_read(
        &self,
        id: i32,
        context: &C) -> Result<ItemPocketReadResponse, ApiError>;

    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LanguageListResponse, ApiError>;

    async fn language_read(
        &self,
        id: i32,
        context: &C) -> Result<LanguageReadResponse, ApiError>;

    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LocationListResponse, ApiError>;

    async fn location_read(
        &self,
        id: i32,
        context: &C) -> Result<LocationReadResponse, ApiError>;

    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<LocationAreaListResponse, ApiError>;

    async fn location_area_read(
        &self,
        id: i32,
        context: &C) -> Result<LocationAreaReadResponse, ApiError>;

    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MachineListResponse, ApiError>;

    async fn machine_read(
        &self,
        id: i32,
        context: &C) -> Result<MachineReadResponse, ApiError>;

    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveListResponse, ApiError>;

    async fn move_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveReadResponse, ApiError>;

    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveAilmentListResponse, ApiError>;

    async fn move_ailment_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveAilmentReadResponse, ApiError>;

    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveBattleStyleListResponse, ApiError>;

    async fn move_battle_style_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveBattleStyleReadResponse, ApiError>;

    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveCategoryListResponse, ApiError>;

    async fn move_category_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveCategoryReadResponse, ApiError>;

    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveDamageClassListResponse, ApiError>;

    async fn move_damage_class_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveDamageClassReadResponse, ApiError>;

    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveLearnMethodListResponse, ApiError>;

    async fn move_learn_method_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveLearnMethodReadResponse, ApiError>;

    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<MoveTargetListResponse, ApiError>;

    async fn move_target_read(
        &self,
        id: i32,
        context: &C) -> Result<MoveTargetReadResponse, ApiError>;

    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<NatureListResponse, ApiError>;

    async fn nature_read(
        &self,
        id: i32,
        context: &C) -> Result<NatureReadResponse, ApiError>;

    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PalParkAreaListResponse, ApiError>;

    async fn pal_park_area_read(
        &self,
        id: i32,
        context: &C) -> Result<PalParkAreaReadResponse, ApiError>;

    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokeathlonStatListResponse, ApiError>;

    async fn pokeathlon_stat_read(
        &self,
        id: i32,
        context: &C) -> Result<PokeathlonStatReadResponse, ApiError>;

    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokedexListResponse, ApiError>;

    async fn pokedex_read(
        &self,
        id: i32,
        context: &C) -> Result<PokedexReadResponse, ApiError>;

    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonListResponse, ApiError>;

    async fn pokemon_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonReadResponse, ApiError>;

    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonColorListResponse, ApiError>;

    async fn pokemon_color_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonColorReadResponse, ApiError>;

    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonFormListResponse, ApiError>;

    async fn pokemon_form_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonFormReadResponse, ApiError>;

    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonHabitatListResponse, ApiError>;

    async fn pokemon_habitat_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonHabitatReadResponse, ApiError>;

    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonShapeListResponse, ApiError>;

    async fn pokemon_shape_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonShapeReadResponse, ApiError>;

    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<PokemonSpeciesListResponse, ApiError>;

    async fn pokemon_species_read(
        &self,
        id: i32,
        context: &C) -> Result<PokemonSpeciesReadResponse, ApiError>;

    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<RegionListResponse, ApiError>;

    async fn region_read(
        &self,
        id: i32,
        context: &C) -> Result<RegionReadResponse, ApiError>;

    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<StatListResponse, ApiError>;

    async fn stat_read(
        &self,
        id: i32,
        context: &C) -> Result<StatReadResponse, ApiError>;

    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<SuperContestEffectListResponse, ApiError>;

    async fn super_contest_effect_read(
        &self,
        id: i32,
        context: &C) -> Result<SuperContestEffectReadResponse, ApiError>;

    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<TypeListResponse, ApiError>;

    async fn type_read(
        &self,
        id: i32,
        context: &C) -> Result<TypeReadResponse, ApiError>;

    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<VersionListResponse, ApiError>;

    async fn version_read(
        &self,
        id: i32,
        context: &C) -> Result<VersionReadResponse, ApiError>;

    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<VersionGroupListResponse, ApiError>;

    async fn version_group_read(
        &self,
        id: i32,
        context: &C) -> Result<VersionGroupReadResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<AbilityListResponse, ApiError>;

    async fn ability_read(
        &self,
        id: i32,
        ) -> Result<AbilityReadResponse, ApiError>;

    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<BerryListResponse, ApiError>;

    async fn berry_read(
        &self,
        id: i32,
        ) -> Result<BerryReadResponse, ApiError>;

    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<BerryFirmnessListResponse, ApiError>;

    async fn berry_firmness_read(
        &self,
        id: i32,
        ) -> Result<BerryFirmnessReadResponse, ApiError>;

    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<BerryFlavorListResponse, ApiError>;

    async fn berry_flavor_read(
        &self,
        id: i32,
        ) -> Result<BerryFlavorReadResponse, ApiError>;

    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<CharacteristicListResponse, ApiError>;

    async fn characteristic_read(
        &self,
        id: i32,
        ) -> Result<CharacteristicReadResponse, ApiError>;

    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ContestEffectListResponse, ApiError>;

    async fn contest_effect_read(
        &self,
        id: i32,
        ) -> Result<ContestEffectReadResponse, ApiError>;

    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ContestTypeListResponse, ApiError>;

    async fn contest_type_read(
        &self,
        id: i32,
        ) -> Result<ContestTypeReadResponse, ApiError>;

    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EggGroupListResponse, ApiError>;

    async fn egg_group_read(
        &self,
        id: i32,
        ) -> Result<EggGroupReadResponse, ApiError>;

    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EncounterConditionListResponse, ApiError>;

    async fn encounter_condition_read(
        &self,
        id: i32,
        ) -> Result<EncounterConditionReadResponse, ApiError>;

    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EncounterConditionValueListResponse, ApiError>;

    async fn encounter_condition_value_read(
        &self,
        id: i32,
        ) -> Result<EncounterConditionValueReadResponse, ApiError>;

    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EncounterMethodListResponse, ApiError>;

    async fn encounter_method_read(
        &self,
        id: i32,
        ) -> Result<EncounterMethodReadResponse, ApiError>;

    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EvolutionChainListResponse, ApiError>;

    async fn evolution_chain_read(
        &self,
        id: i32,
        ) -> Result<EvolutionChainReadResponse, ApiError>;

    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EvolutionTriggerListResponse, ApiError>;

    async fn evolution_trigger_read(
        &self,
        id: i32,
        ) -> Result<EvolutionTriggerReadResponse, ApiError>;

    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<GenderListResponse, ApiError>;

    async fn gender_read(
        &self,
        id: i32,
        ) -> Result<GenderReadResponse, ApiError>;

    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<GenerationListResponse, ApiError>;

    async fn generation_read(
        &self,
        id: i32,
        ) -> Result<GenerationReadResponse, ApiError>;

    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<GrowthRateListResponse, ApiError>;

    async fn growth_rate_read(
        &self,
        id: i32,
        ) -> Result<GrowthRateReadResponse, ApiError>;

    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemListResponse, ApiError>;

    async fn item_read(
        &self,
        id: i32,
        ) -> Result<ItemReadResponse, ApiError>;

    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemAttributeListResponse, ApiError>;

    async fn item_attribute_read(
        &self,
        id: i32,
        ) -> Result<ItemAttributeReadResponse, ApiError>;

    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemCategoryListResponse, ApiError>;

    async fn item_category_read(
        &self,
        id: i32,
        ) -> Result<ItemCategoryReadResponse, ApiError>;

    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemFlingEffectListResponse, ApiError>;

    async fn item_fling_effect_read(
        &self,
        id: i32,
        ) -> Result<ItemFlingEffectReadResponse, ApiError>;

    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemPocketListResponse, ApiError>;

    async fn item_pocket_read(
        &self,
        id: i32,
        ) -> Result<ItemPocketReadResponse, ApiError>;

    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LanguageListResponse, ApiError>;

    async fn language_read(
        &self,
        id: i32,
        ) -> Result<LanguageReadResponse, ApiError>;

    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LocationListResponse, ApiError>;

    async fn location_read(
        &self,
        id: i32,
        ) -> Result<LocationReadResponse, ApiError>;

    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LocationAreaListResponse, ApiError>;

    async fn location_area_read(
        &self,
        id: i32,
        ) -> Result<LocationAreaReadResponse, ApiError>;

    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MachineListResponse, ApiError>;

    async fn machine_read(
        &self,
        id: i32,
        ) -> Result<MachineReadResponse, ApiError>;

    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveListResponse, ApiError>;

    async fn move_read(
        &self,
        id: i32,
        ) -> Result<MoveReadResponse, ApiError>;

    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveAilmentListResponse, ApiError>;

    async fn move_ailment_read(
        &self,
        id: i32,
        ) -> Result<MoveAilmentReadResponse, ApiError>;

    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveBattleStyleListResponse, ApiError>;

    async fn move_battle_style_read(
        &self,
        id: i32,
        ) -> Result<MoveBattleStyleReadResponse, ApiError>;

    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveCategoryListResponse, ApiError>;

    async fn move_category_read(
        &self,
        id: i32,
        ) -> Result<MoveCategoryReadResponse, ApiError>;

    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveDamageClassListResponse, ApiError>;

    async fn move_damage_class_read(
        &self,
        id: i32,
        ) -> Result<MoveDamageClassReadResponse, ApiError>;

    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveLearnMethodListResponse, ApiError>;

    async fn move_learn_method_read(
        &self,
        id: i32,
        ) -> Result<MoveLearnMethodReadResponse, ApiError>;

    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveTargetListResponse, ApiError>;

    async fn move_target_read(
        &self,
        id: i32,
        ) -> Result<MoveTargetReadResponse, ApiError>;

    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<NatureListResponse, ApiError>;

    async fn nature_read(
        &self,
        id: i32,
        ) -> Result<NatureReadResponse, ApiError>;

    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PalParkAreaListResponse, ApiError>;

    async fn pal_park_area_read(
        &self,
        id: i32,
        ) -> Result<PalParkAreaReadResponse, ApiError>;

    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokeathlonStatListResponse, ApiError>;

    async fn pokeathlon_stat_read(
        &self,
        id: i32,
        ) -> Result<PokeathlonStatReadResponse, ApiError>;

    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokedexListResponse, ApiError>;

    async fn pokedex_read(
        &self,
        id: i32,
        ) -> Result<PokedexReadResponse, ApiError>;

    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonListResponse, ApiError>;

    async fn pokemon_read(
        &self,
        id: i32,
        ) -> Result<PokemonReadResponse, ApiError>;

    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonColorListResponse, ApiError>;

    async fn pokemon_color_read(
        &self,
        id: i32,
        ) -> Result<PokemonColorReadResponse, ApiError>;

    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonFormListResponse, ApiError>;

    async fn pokemon_form_read(
        &self,
        id: i32,
        ) -> Result<PokemonFormReadResponse, ApiError>;

    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonHabitatListResponse, ApiError>;

    async fn pokemon_habitat_read(
        &self,
        id: i32,
        ) -> Result<PokemonHabitatReadResponse, ApiError>;

    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonShapeListResponse, ApiError>;

    async fn pokemon_shape_read(
        &self,
        id: i32,
        ) -> Result<PokemonShapeReadResponse, ApiError>;

    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonSpeciesListResponse, ApiError>;

    async fn pokemon_species_read(
        &self,
        id: i32,
        ) -> Result<PokemonSpeciesReadResponse, ApiError>;

    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<RegionListResponse, ApiError>;

    async fn region_read(
        &self,
        id: i32,
        ) -> Result<RegionReadResponse, ApiError>;

    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<StatListResponse, ApiError>;

    async fn stat_read(
        &self,
        id: i32,
        ) -> Result<StatReadResponse, ApiError>;

    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<SuperContestEffectListResponse, ApiError>;

    async fn super_contest_effect_read(
        &self,
        id: i32,
        ) -> Result<SuperContestEffectReadResponse, ApiError>;

    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<TypeListResponse, ApiError>;

    async fn type_read(
        &self,
        id: i32,
        ) -> Result<TypeReadResponse, ApiError>;

    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<VersionListResponse, ApiError>;

    async fn version_read(
        &self,
        id: i32,
        ) -> Result<VersionReadResponse, ApiError>;

    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<VersionGroupListResponse, ApiError>;

    async fn version_group_read(
        &self,
        id: i32,
        ) -> Result<VersionGroupReadResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self: Self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    async fn ability_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<AbilityListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ability_list(limit, offset, &context).await
    }

    async fn ability_read(
        &self,
        id: i32,
        ) -> Result<AbilityReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().ability_read(id, &context).await
    }

    async fn berry_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<BerryListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_list(limit, offset, &context).await
    }

    async fn berry_read(
        &self,
        id: i32,
        ) -> Result<BerryReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_read(id, &context).await
    }

    async fn berry_firmness_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<BerryFirmnessListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_firmness_list(limit, offset, &context).await
    }

    async fn berry_firmness_read(
        &self,
        id: i32,
        ) -> Result<BerryFirmnessReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_firmness_read(id, &context).await
    }

    async fn berry_flavor_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<BerryFlavorListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_flavor_list(limit, offset, &context).await
    }

    async fn berry_flavor_read(
        &self,
        id: i32,
        ) -> Result<BerryFlavorReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().berry_flavor_read(id, &context).await
    }

    async fn characteristic_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<CharacteristicListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().characteristic_list(limit, offset, &context).await
    }

    async fn characteristic_read(
        &self,
        id: i32,
        ) -> Result<CharacteristicReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().characteristic_read(id, &context).await
    }

    async fn contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ContestEffectListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_effect_list(limit, offset, &context).await
    }

    async fn contest_effect_read(
        &self,
        id: i32,
        ) -> Result<ContestEffectReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_effect_read(id, &context).await
    }

    async fn contest_type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ContestTypeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_type_list(limit, offset, &context).await
    }

    async fn contest_type_read(
        &self,
        id: i32,
        ) -> Result<ContestTypeReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().contest_type_read(id, &context).await
    }

    async fn egg_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EggGroupListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().egg_group_list(limit, offset, &context).await
    }

    async fn egg_group_read(
        &self,
        id: i32,
        ) -> Result<EggGroupReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().egg_group_read(id, &context).await
    }

    async fn encounter_condition_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EncounterConditionListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_list(limit, offset, &context).await
    }

    async fn encounter_condition_read(
        &self,
        id: i32,
        ) -> Result<EncounterConditionReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_read(id, &context).await
    }

    async fn encounter_condition_value_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EncounterConditionValueListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_value_list(limit, offset, &context).await
    }

    async fn encounter_condition_value_read(
        &self,
        id: i32,
        ) -> Result<EncounterConditionValueReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_condition_value_read(id, &context).await
    }

    async fn encounter_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EncounterMethodListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_method_list(limit, offset, &context).await
    }

    async fn encounter_method_read(
        &self,
        id: i32,
        ) -> Result<EncounterMethodReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().encounter_method_read(id, &context).await
    }

    async fn evolution_chain_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EvolutionChainListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_chain_list(limit, offset, &context).await
    }

    async fn evolution_chain_read(
        &self,
        id: i32,
        ) -> Result<EvolutionChainReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_chain_read(id, &context).await
    }

    async fn evolution_trigger_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<EvolutionTriggerListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_trigger_list(limit, offset, &context).await
    }

    async fn evolution_trigger_read(
        &self,
        id: i32,
        ) -> Result<EvolutionTriggerReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().evolution_trigger_read(id, &context).await
    }

    async fn gender_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<GenderListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().gender_list(limit, offset, &context).await
    }

    async fn gender_read(
        &self,
        id: i32,
        ) -> Result<GenderReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().gender_read(id, &context).await
    }

    async fn generation_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<GenerationListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generation_list(limit, offset, &context).await
    }

    async fn generation_read(
        &self,
        id: i32,
        ) -> Result<GenerationReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().generation_read(id, &context).await
    }

    async fn growth_rate_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<GrowthRateListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().growth_rate_list(limit, offset, &context).await
    }

    async fn growth_rate_read(
        &self,
        id: i32,
        ) -> Result<GrowthRateReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().growth_rate_read(id, &context).await
    }

    async fn item_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_list(limit, offset, &context).await
    }

    async fn item_read(
        &self,
        id: i32,
        ) -> Result<ItemReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_read(id, &context).await
    }

    async fn item_attribute_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemAttributeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_attribute_list(limit, offset, &context).await
    }

    async fn item_attribute_read(
        &self,
        id: i32,
        ) -> Result<ItemAttributeReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_attribute_read(id, &context).await
    }

    async fn item_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemCategoryListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_category_list(limit, offset, &context).await
    }

    async fn item_category_read(
        &self,
        id: i32,
        ) -> Result<ItemCategoryReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_category_read(id, &context).await
    }

    async fn item_fling_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemFlingEffectListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_fling_effect_list(limit, offset, &context).await
    }

    async fn item_fling_effect_read(
        &self,
        id: i32,
        ) -> Result<ItemFlingEffectReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_fling_effect_read(id, &context).await
    }

    async fn item_pocket_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<ItemPocketListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_pocket_list(limit, offset, &context).await
    }

    async fn item_pocket_read(
        &self,
        id: i32,
        ) -> Result<ItemPocketReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().item_pocket_read(id, &context).await
    }

    async fn language_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LanguageListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().language_list(limit, offset, &context).await
    }

    async fn language_read(
        &self,
        id: i32,
        ) -> Result<LanguageReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().language_read(id, &context).await
    }

    async fn location_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LocationListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_list(limit, offset, &context).await
    }

    async fn location_read(
        &self,
        id: i32,
        ) -> Result<LocationReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_read(id, &context).await
    }

    async fn location_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<LocationAreaListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_area_list(limit, offset, &context).await
    }

    async fn location_area_read(
        &self,
        id: i32,
        ) -> Result<LocationAreaReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().location_area_read(id, &context).await
    }

    async fn machine_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MachineListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().machine_list(limit, offset, &context).await
    }

    async fn machine_read(
        &self,
        id: i32,
        ) -> Result<MachineReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().machine_read(id, &context).await
    }

    async fn move_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_list(limit, offset, &context).await
    }

    async fn move_read(
        &self,
        id: i32,
        ) -> Result<MoveReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_read(id, &context).await
    }

    async fn move_ailment_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveAilmentListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_ailment_list(limit, offset, &context).await
    }

    async fn move_ailment_read(
        &self,
        id: i32,
        ) -> Result<MoveAilmentReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_ailment_read(id, &context).await
    }

    async fn move_battle_style_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveBattleStyleListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_battle_style_list(limit, offset, &context).await
    }

    async fn move_battle_style_read(
        &self,
        id: i32,
        ) -> Result<MoveBattleStyleReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_battle_style_read(id, &context).await
    }

    async fn move_category_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveCategoryListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_category_list(limit, offset, &context).await
    }

    async fn move_category_read(
        &self,
        id: i32,
        ) -> Result<MoveCategoryReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_category_read(id, &context).await
    }

    async fn move_damage_class_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveDamageClassListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_damage_class_list(limit, offset, &context).await
    }

    async fn move_damage_class_read(
        &self,
        id: i32,
        ) -> Result<MoveDamageClassReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_damage_class_read(id, &context).await
    }

    async fn move_learn_method_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveLearnMethodListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_learn_method_list(limit, offset, &context).await
    }

    async fn move_learn_method_read(
        &self,
        id: i32,
        ) -> Result<MoveLearnMethodReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_learn_method_read(id, &context).await
    }

    async fn move_target_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<MoveTargetListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_target_list(limit, offset, &context).await
    }

    async fn move_target_read(
        &self,
        id: i32,
        ) -> Result<MoveTargetReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().move_target_read(id, &context).await
    }

    async fn nature_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<NatureListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().nature_list(limit, offset, &context).await
    }

    async fn nature_read(
        &self,
        id: i32,
        ) -> Result<NatureReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().nature_read(id, &context).await
    }

    async fn pal_park_area_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PalParkAreaListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pal_park_area_list(limit, offset, &context).await
    }

    async fn pal_park_area_read(
        &self,
        id: i32,
        ) -> Result<PalParkAreaReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pal_park_area_read(id, &context).await
    }

    async fn pokeathlon_stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokeathlonStatListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokeathlon_stat_list(limit, offset, &context).await
    }

    async fn pokeathlon_stat_read(
        &self,
        id: i32,
        ) -> Result<PokeathlonStatReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokeathlon_stat_read(id, &context).await
    }

    async fn pokedex_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokedexListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokedex_list(limit, offset, &context).await
    }

    async fn pokedex_read(
        &self,
        id: i32,
        ) -> Result<PokedexReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokedex_read(id, &context).await
    }

    async fn pokemon_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_list(limit, offset, &context).await
    }

    async fn pokemon_read(
        &self,
        id: i32,
        ) -> Result<PokemonReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_read(id, &context).await
    }

    async fn pokemon_color_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonColorListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_color_list(limit, offset, &context).await
    }

    async fn pokemon_color_read(
        &self,
        id: i32,
        ) -> Result<PokemonColorReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_color_read(id, &context).await
    }

    async fn pokemon_form_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonFormListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_form_list(limit, offset, &context).await
    }

    async fn pokemon_form_read(
        &self,
        id: i32,
        ) -> Result<PokemonFormReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_form_read(id, &context).await
    }

    async fn pokemon_habitat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonHabitatListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_habitat_list(limit, offset, &context).await
    }

    async fn pokemon_habitat_read(
        &self,
        id: i32,
        ) -> Result<PokemonHabitatReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_habitat_read(id, &context).await
    }

    async fn pokemon_shape_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonShapeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_shape_list(limit, offset, &context).await
    }

    async fn pokemon_shape_read(
        &self,
        id: i32,
        ) -> Result<PokemonShapeReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_shape_read(id, &context).await
    }

    async fn pokemon_species_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<PokemonSpeciesListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_species_list(limit, offset, &context).await
    }

    async fn pokemon_species_read(
        &self,
        id: i32,
        ) -> Result<PokemonSpeciesReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().pokemon_species_read(id, &context).await
    }

    async fn region_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<RegionListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().region_list(limit, offset, &context).await
    }

    async fn region_read(
        &self,
        id: i32,
        ) -> Result<RegionReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().region_read(id, &context).await
    }

    async fn stat_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<StatListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().stat_list(limit, offset, &context).await
    }

    async fn stat_read(
        &self,
        id: i32,
        ) -> Result<StatReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().stat_read(id, &context).await
    }

    async fn super_contest_effect_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<SuperContestEffectListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().super_contest_effect_list(limit, offset, &context).await
    }

    async fn super_contest_effect_read(
        &self,
        id: i32,
        ) -> Result<SuperContestEffectReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().super_contest_effect_read(id, &context).await
    }

    async fn type_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<TypeListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().type_list(limit, offset, &context).await
    }

    async fn type_read(
        &self,
        id: i32,
        ) -> Result<TypeReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().type_read(id, &context).await
    }

    async fn version_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<VersionListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_list(limit, offset, &context).await
    }

    async fn version_read(
        &self,
        id: i32,
        ) -> Result<VersionReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_read(id, &context).await
    }

    async fn version_group_list(
        &self,
        limit: Option<i32>,
        offset: Option<i32>,
        ) -> Result<VersionGroupListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_group_list(limit, offset, &context).await
    }

    async fn version_group_read(
        &self,
        id: i32,
        ) -> Result<VersionGroupReadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().version_group_read(id, &context).await
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
