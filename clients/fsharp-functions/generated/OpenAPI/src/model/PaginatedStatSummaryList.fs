namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StatSummary
open OpenAPI.Model.string option

module PaginatedStatSummaryList =

  //#region PaginatedStatSummaryList

  [<CLIMutable>]
  type PaginatedStatSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : StatSummary[];
  }

  //#endregion
