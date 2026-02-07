namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner

module LocationAreaDetailPokemonEncountersInner =

  //#region LocationAreaDetailPokemonEncountersInner


  type LocationAreaDetail_pokemon_encounters_inner = {
    Pokemon : AbilityDetailPokemonInnerPokemon;
    VersionDetails : LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[];
  }
  //#endregion
