namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionValueSummary
open OpenAPI.Model.EncounterMethodSummary

module PokemonEncounterDetailResponse =

  //#region PokemonEncounterDetailResponse

  [<CLIMutable>]
  type PokemonEncounterDetailResponse = {
    [<JsonProperty(PropertyName = "chance")>]
    Chance : int;
    [<JsonProperty(PropertyName = "condition_values")>]
    ConditionValues : EncounterConditionValueSummary[];
    [<JsonProperty(PropertyName = "max_level")>]
    MaxLevel : int;
    [<JsonProperty(PropertyName = "method")>]
    Method : EncounterMethodSummary;
    [<JsonProperty(PropertyName = "min_level")>]
    MinLevel : int;
  }

  //#endregion
