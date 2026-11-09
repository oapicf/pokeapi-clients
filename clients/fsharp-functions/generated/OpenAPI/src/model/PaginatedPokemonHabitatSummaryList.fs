namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonHabitatSummary
open OpenAPI.Model.string option

module PaginatedPokemonHabitatSummaryList =

  //#region PaginatedPokemonHabitatSummaryList

  [<CLIMutable>]
  type PaginatedPokemonHabitatSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonHabitatSummary[];
  }

  //#endregion
