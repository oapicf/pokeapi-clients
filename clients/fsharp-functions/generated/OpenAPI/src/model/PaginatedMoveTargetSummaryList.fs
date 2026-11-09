namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveTargetSummary
open OpenAPI.Model.string option

module PaginatedMoveTargetSummaryList =

  //#region PaginatedMoveTargetSummaryList

  [<CLIMutable>]
  type PaginatedMoveTargetSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveTargetSummary[];
  }

  //#endregion
