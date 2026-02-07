namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails =

  //#region LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

  [<CLIMutable>]
  type LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails = {
    [<JsonProperty(PropertyName = "min_level")>]
    MinLevel : int;
    [<JsonProperty(PropertyName = "max_level")>]
    MaxLevel : int;
    [<JsonProperty(PropertyName = "condition_values")>]
    ConditionValues : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "chance")>]
    Chance : int;
    [<JsonProperty(PropertyName = "method")>]
    Method : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
