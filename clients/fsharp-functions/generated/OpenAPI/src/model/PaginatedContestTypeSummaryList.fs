namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContestTypeSummary

module PaginatedContestTypeSummaryList =

  //#region PaginatedContestTypeSummaryList

  [<CLIMutable>]
  type PaginatedContestTypeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : ContestTypeSummary[];
  }

  //#endregion
