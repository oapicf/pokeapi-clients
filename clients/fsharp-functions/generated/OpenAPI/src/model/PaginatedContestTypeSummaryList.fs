namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContestTypeSummary
open OpenAPI.Model.string option

module PaginatedContestTypeSummaryList =

  //#region PaginatedContestTypeSummaryList

  [<CLIMutable>]
  type PaginatedContestTypeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : ContestTypeSummary[];
  }

  //#endregion
