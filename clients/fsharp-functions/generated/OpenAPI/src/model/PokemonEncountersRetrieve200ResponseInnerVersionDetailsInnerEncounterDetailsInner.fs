namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod

module PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner =

  //#region PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner

  [<CLIMutable>]
  type PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner = {
    [<JsonProperty(PropertyName = "chance")>]
    Chance : decimal;
    [<JsonProperty(PropertyName = "condition_values")>]
    ConditionValues : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner[];
    [<JsonProperty(PropertyName = "max_level")>]
    MaxLevel : decimal;
    [<JsonProperty(PropertyName = "method")>]
    Method : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;
    [<JsonProperty(PropertyName = "min_level")>]
    MinLevel : decimal;
  }

  //#endregion
