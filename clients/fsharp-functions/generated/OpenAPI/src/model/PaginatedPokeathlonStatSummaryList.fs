namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokeathlonStatSummary
open OpenAPI.Model.string option

module PaginatedPokeathlonStatSummaryList =

  //#region PaginatedPokeathlonStatSummaryList

  [<CLIMutable>]
  type PaginatedPokeathlonStatSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokeathlonStatSummary[];
  }

  //#endregion
