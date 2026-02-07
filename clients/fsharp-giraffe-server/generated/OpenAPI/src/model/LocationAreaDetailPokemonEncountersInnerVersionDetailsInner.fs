namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

module LocationAreaDetailPokemonEncountersInnerVersionDetailsInner =

  //#region LocationAreaDetailPokemonEncountersInnerVersionDetailsInner


  type LocationAreaDetail_pokemon_encounters_inner_version_details_inner = {
    Version : AbilityDetailPokemonInnerPokemon;
    MaxChance : int;
    EncounterDetails : LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
  }
  //#endregion
