namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveMetaCategorySummary
open OpenAPI.Model.string option

module PaginatedMoveMetaCategorySummaryList =

  //#region PaginatedMoveMetaCategorySummaryList

  [<CLIMutable>]
  type PaginatedMoveMetaCategorySummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveMetaCategorySummary[];
  }

  //#endregion
