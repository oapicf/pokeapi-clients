namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonShapeSummary

module PaginatedPokemonShapeSummaryList =

  //#region PaginatedPokemonShapeSummaryList

  [<CLIMutable>]
  type PaginatedPokemonShapeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonShapeSummary[];
  }

  //#endregion
