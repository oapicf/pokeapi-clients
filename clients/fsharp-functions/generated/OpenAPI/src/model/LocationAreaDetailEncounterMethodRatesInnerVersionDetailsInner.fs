namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner =

  //#region LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner

  [<CLIMutable>]
  type LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner = {
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
    [<JsonProperty(PropertyName = "version")>]
    Version : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
