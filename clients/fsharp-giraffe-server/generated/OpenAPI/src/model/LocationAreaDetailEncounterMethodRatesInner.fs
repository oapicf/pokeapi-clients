namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner

module LocationAreaDetailEncounterMethodRatesInner =

  //#region LocationAreaDetailEncounterMethodRatesInner


  type LocationAreaDetail_encounter_method_rates_inner = {
    EncounterMethod : AbilityDetailPokemonInnerPokemon;
    VersionDetails : LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[];
  }
  //#endregion
