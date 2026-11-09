namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionValueSummary
open OpenAPI.Model.EncounterMethodSummary
open OpenAPI.Model.EncounterPokemonDetail

module LocationAreaEncounterDetail =

  //#region LocationAreaEncounterDetail

  [<CLIMutable>]
  type LocationAreaEncounterDetail = {
    [<JsonProperty(PropertyName = "min_level")>]
    MinLevel : int;
    [<JsonProperty(PropertyName = "max_level")>]
    MaxLevel : int;
    [<JsonProperty(PropertyName = "chance")>]
    Chance : int;
    [<JsonProperty(PropertyName = "method")>]
    Method : EncounterMethodSummary;
    [<JsonProperty(PropertyName = "condition_values")>]
    ConditionValues : EncounterConditionValueSummary[];
    [<JsonProperty(PropertyName = "pokemon_details")>]
    PokemonDetails : EncounterPokemonDetail;
  }

  //#endregion
