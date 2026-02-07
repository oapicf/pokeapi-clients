namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokeathlonStatSummary

module PaginatedPokeathlonStatSummaryList =

  //#region PaginatedPokeathlonStatSummaryList

  [<CLIMutable>]
  type PaginatedPokeathlonStatSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokeathlonStatSummary[];
  }

  //#endregion
