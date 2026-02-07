namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveLearnMethodSummary

module PaginatedMoveLearnMethodSummaryList =

  //#region PaginatedMoveLearnMethodSummaryList

  [<CLIMutable>]
  type PaginatedMoveLearnMethodSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveLearnMethodSummary[];
  }

  //#endregion
