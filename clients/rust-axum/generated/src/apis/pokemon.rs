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
pub enum AbilityListResponse {

    Status200
    (models::PaginatedAbilitySummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AbilityRetrieveResponse {

    Status200
    (models::AbilityDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CharacteristicListResponse {

    Status200
    (models::PaginatedCharacteristicSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CharacteristicRetrieveResponse {

    Status200
    (models::CharacteristicDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EggGroupListResponse {

    Status200
    (models::PaginatedEggGroupSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum EggGroupRetrieveResponse {

    Status200
    (models::EggGroupDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenderListResponse {

    Status200
    (models::PaginatedGenderSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GenderRetrieveResponse {

    Status200
    (models::GenderDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GrowthRateListResponse {

    Status200
    (models::PaginatedGrowthRateSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GrowthRateRetrieveResponse {

    Status200
    (models::GrowthRateDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveDamageClassListResponse {

    Status200
    (models::PaginatedMoveDamageClassSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MoveDamageClassRetrieveResponse {

    Status200
    (models::MoveDamageClassDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NatureListResponse {

    Status200
    (models::PaginatedNatureSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NatureRetrieveResponse {

    Status200
    (models::NatureDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokeathlonStatListResponse {

    Status200
    (models::PaginatedPokeathlonStatSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokeathlonStatRetrieveResponse {

    Status200
    (models::PokeathlonStatDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonColorListResponse {

    Status200
    (models::PaginatedPokemonColorSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonColorRetrieveResponse {

    Status200
    (models::PokemonColorDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonFormListResponse {

    Status200
    (models::PaginatedPokemonFormSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonFormRetrieveResponse {

    Status200
    (models::PokemonFormDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonHabitatListResponse {

    Status200
    (models::PaginatedPokemonHabitatSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonHabitatRetrieveResponse {

    Status200
    (models::PokemonHabitatDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonListResponse {

    Status200
    (models::PaginatedPokemonSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonRetrieveResponse {

    Status200
    (models::PokemonDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonShapeListResponse {

    Status200
    (models::PaginatedPokemonShapeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonShapeRetrieveResponse {

    Status200
    (models::PokemonShapeDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonSpeciesListResponse {

    Status200
    (models::PaginatedPokemonSpeciesSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PokemonSpeciesRetrieveResponse {

    Status200
    (models::PokemonSpeciesDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum StatListResponse {

    Status200
    (models::PaginatedStatSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum StatRetrieveResponse {

    Status200
    (models::StatDetail)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TypeListResponse {

    Status200
    (models::PaginatedTypeSummaryList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TypeRetrieveResponse {

    Status200
    (models::TypeDetail)
}




/// Pokemon
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Pokemon<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// AbilityList - GET /api/v2/ability/
    async fn ability_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::AbilityListQueryParams,
    ) -> Result<AbilityListResponse, E>;

    /// AbilityRetrieve - GET /api/v2/ability/{id}/
    async fn ability_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::AbilityRetrievePathParams,
    ) -> Result<AbilityRetrieveResponse, E>;

    /// List charecterictics.
    ///
    /// CharacteristicList - GET /api/v2/characteristic/
    async fn characteristic_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::CharacteristicListQueryParams,
    ) -> Result<CharacteristicListResponse, E>;

    /// Get characteristic.
    ///
    /// CharacteristicRetrieve - GET /api/v2/characteristic/{id}/
    async fn characteristic_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CharacteristicRetrievePathParams,
    ) -> Result<CharacteristicRetrieveResponse, E>;

    /// List egg groups.
    ///
    /// EggGroupList - GET /api/v2/egg-group/
    async fn egg_group_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::EggGroupListQueryParams,
    ) -> Result<EggGroupListResponse, E>;

    /// Get egg group.
    ///
    /// EggGroupRetrieve - GET /api/v2/egg-group/{id}/
    async fn egg_group_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EggGroupRetrievePathParams,
    ) -> Result<EggGroupRetrieveResponse, E>;

    /// List genders.
    ///
    /// GenderList - GET /api/v2/gender/
    async fn gender_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::GenderListQueryParams,
    ) -> Result<GenderListResponse, E>;

    /// Get gender.
    ///
    /// GenderRetrieve - GET /api/v2/gender/{id}/
    async fn gender_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GenderRetrievePathParams,
    ) -> Result<GenderRetrieveResponse, E>;

    /// List growth rates.
    ///
    /// GrowthRateList - GET /api/v2/growth-rate/
    async fn growth_rate_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::GrowthRateListQueryParams,
    ) -> Result<GrowthRateListResponse, E>;

    /// Get growth rate.
    ///
    /// GrowthRateRetrieve - GET /api/v2/growth-rate/{id}/
    async fn growth_rate_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GrowthRateRetrievePathParams,
    ) -> Result<GrowthRateRetrieveResponse, E>;

    /// List move damage classes.
    ///
    /// MoveDamageClassList - GET /api/v2/move-damage-class/
    async fn move_damage_class_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MoveDamageClassListQueryParams,
    ) -> Result<MoveDamageClassListResponse, E>;

    /// Get move damage class.
    ///
    /// MoveDamageClassRetrieve - GET /api/v2/move-damage-class/{id}/
    async fn move_damage_class_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::MoveDamageClassRetrievePathParams,
    ) -> Result<MoveDamageClassRetrieveResponse, E>;

    /// List natures.
    ///
    /// NatureList - GET /api/v2/nature/
    async fn nature_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::NatureListQueryParams,
    ) -> Result<NatureListResponse, E>;

    /// Get nature.
    ///
    /// NatureRetrieve - GET /api/v2/nature/{id}/
    async fn nature_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::NatureRetrievePathParams,
    ) -> Result<NatureRetrieveResponse, E>;

    /// List pokeathlon stats.
    ///
    /// PokeathlonStatList - GET /api/v2/pokeathlon-stat/
    async fn pokeathlon_stat_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokeathlonStatListQueryParams,
    ) -> Result<PokeathlonStatListResponse, E>;

    /// Get pokeathlon stat.
    ///
    /// PokeathlonStatRetrieve - GET /api/v2/pokeathlon-stat/{id}/
    async fn pokeathlon_stat_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokeathlonStatRetrievePathParams,
    ) -> Result<PokeathlonStatRetrieveResponse, E>;

    /// List pokemon colors.
    ///
    /// PokemonColorList - GET /api/v2/pokemon-color/
    async fn pokemon_color_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokemonColorListQueryParams,
    ) -> Result<PokemonColorListResponse, E>;

    /// Get pokemon color.
    ///
    /// PokemonColorRetrieve - GET /api/v2/pokemon-color/{id}/
    async fn pokemon_color_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokemonColorRetrievePathParams,
    ) -> Result<PokemonColorRetrieveResponse, E>;

    /// List pokemon forms.
    ///
    /// PokemonFormList - GET /api/v2/pokemon-form/
    async fn pokemon_form_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokemonFormListQueryParams,
    ) -> Result<PokemonFormListResponse, E>;

    /// Get pokemon form.
    ///
    /// PokemonFormRetrieve - GET /api/v2/pokemon-form/{id}/
    async fn pokemon_form_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokemonFormRetrievePathParams,
    ) -> Result<PokemonFormRetrieveResponse, E>;

    /// List pokemom habitas.
    ///
    /// PokemonHabitatList - GET /api/v2/pokemon-habitat/
    async fn pokemon_habitat_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokemonHabitatListQueryParams,
    ) -> Result<PokemonHabitatListResponse, E>;

    /// Get pokemom habita.
    ///
    /// PokemonHabitatRetrieve - GET /api/v2/pokemon-habitat/{id}/
    async fn pokemon_habitat_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokemonHabitatRetrievePathParams,
    ) -> Result<PokemonHabitatRetrieveResponse, E>;

    /// List pokemon.
    ///
    /// PokemonList - GET /api/v2/pokemon/
    async fn pokemon_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokemonListQueryParams,
    ) -> Result<PokemonListResponse, E>;

    /// Get pokemon.
    ///
    /// PokemonRetrieve - GET /api/v2/pokemon/{id}/
    async fn pokemon_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokemonRetrievePathParams,
    ) -> Result<PokemonRetrieveResponse, E>;

    /// List pokemon shapes.
    ///
    /// PokemonShapeList - GET /api/v2/pokemon-shape/
    async fn pokemon_shape_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokemonShapeListQueryParams,
    ) -> Result<PokemonShapeListResponse, E>;

    /// Get pokemon shape.
    ///
    /// PokemonShapeRetrieve - GET /api/v2/pokemon-shape/{id}/
    async fn pokemon_shape_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokemonShapeRetrievePathParams,
    ) -> Result<PokemonShapeRetrieveResponse, E>;

    /// List pokemon species.
    ///
    /// PokemonSpeciesList - GET /api/v2/pokemon-species/
    async fn pokemon_species_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::PokemonSpeciesListQueryParams,
    ) -> Result<PokemonSpeciesListResponse, E>;

    /// Get pokemon species.
    ///
    /// PokemonSpeciesRetrieve - GET /api/v2/pokemon-species/{id}/
    async fn pokemon_species_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::PokemonSpeciesRetrievePathParams,
    ) -> Result<PokemonSpeciesRetrieveResponse, E>;

    /// List stats.
    ///
    /// StatList - GET /api/v2/stat/
    async fn stat_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::StatListQueryParams,
    ) -> Result<StatListResponse, E>;

    /// Get stat.
    ///
    /// StatRetrieve - GET /api/v2/stat/{id}/
    async fn stat_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::StatRetrievePathParams,
    ) -> Result<StatRetrieveResponse, E>;

    /// List types.
    ///
    /// TypeList - GET /api/v2/type/
    async fn type_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::TypeListQueryParams,
    ) -> Result<TypeListResponse, E>;

    /// Get types.
    ///
    /// TypeRetrieve - GET /api/v2/type/{id}/
    async fn type_retrieve(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::TypeRetrievePathParams,
    ) -> Result<TypeRetrieveResponse, E>;
}
