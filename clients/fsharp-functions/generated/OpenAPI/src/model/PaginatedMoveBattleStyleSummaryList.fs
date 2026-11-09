namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveBattleStyleSummary
open OpenAPI.Model.string option

module PaginatedMoveBattleStyleSummaryList =

  //#region PaginatedMoveBattleStyleSummaryList

  [<CLIMutable>]
  type PaginatedMoveBattleStyleSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveBattleStyleSummary[];
  }

  //#endregion
