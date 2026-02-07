namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContestEffectSummary

module PaginatedContestEffectSummaryList =

  //#region PaginatedContestEffectSummaryList

  [<CLIMutable>]
  type PaginatedContestEffectSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : ContestEffectSummary[];
  }

  //#endregion
