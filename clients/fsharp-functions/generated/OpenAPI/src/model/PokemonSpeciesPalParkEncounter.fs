namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PalParkAreaSummary
open OpenAPI.Model.int option

module PokemonSpeciesPalParkEncounter =

  //#region PokemonSpeciesPalParkEncounter

  [<CLIMutable>]
  type PokemonSpeciesPalParkEncounter = {
    [<JsonProperty(PropertyName = "base_score")>]
    BaseScore : int option;
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
    [<JsonProperty(PropertyName = "area")>]
    Area : PalParkAreaSummary;
  }

  //#endregion
