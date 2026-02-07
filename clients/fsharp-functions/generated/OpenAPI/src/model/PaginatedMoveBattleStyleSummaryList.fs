namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveBattleStyleSummary

module PaginatedMoveBattleStyleSummaryList =

  //#region PaginatedMoveBattleStyleSummaryList

  [<CLIMutable>]
  type PaginatedMoveBattleStyleSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveBattleStyleSummary[];
  }

  //#endregion
