namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner

module LocationAreaDetailEncounterMethodRatesInner =

  //#region LocationAreaDetailEncounterMethodRatesInner

  [<CLIMutable>]
  type LocationAreaDetailEncounterMethodRatesInner = {
    [<JsonProperty(PropertyName = "encounter_method")>]
    EncounterMethod : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[];
  }

  //#endregion
