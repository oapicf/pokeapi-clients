namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.string option

module PaginatedMoveSummaryList =

  //#region PaginatedMoveSummaryList

  [<CLIMutable>]
  type PaginatedMoveSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveSummary[];
  }

  //#endregion
