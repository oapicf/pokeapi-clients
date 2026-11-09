namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonShapeSummary
open OpenAPI.Model.string option

module PaginatedPokemonShapeSummaryList =

  //#region PaginatedPokemonShapeSummaryList

  [<CLIMutable>]
  type PaginatedPokemonShapeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonShapeSummary[];
  }

  //#endregion
