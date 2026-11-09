namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveLearnMethodSummary
open OpenAPI.Model.string option

module PaginatedMoveLearnMethodSummaryList =

  //#region PaginatedMoveLearnMethodSummaryList

  [<CLIMutable>]
  type PaginatedMoveLearnMethodSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveLearnMethodSummary[];
  }

  //#endregion
