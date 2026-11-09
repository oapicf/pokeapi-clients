namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContestEffectSummary
open OpenAPI.Model.string option

module PaginatedContestEffectSummaryList =

  //#region PaginatedContestEffectSummaryList

  [<CLIMutable>]
  type PaginatedContestEffectSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : ContestEffectSummary[];
  }

  //#endregion
