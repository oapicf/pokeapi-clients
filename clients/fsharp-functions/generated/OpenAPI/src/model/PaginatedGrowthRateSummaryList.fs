namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GrowthRateSummary

module PaginatedGrowthRateSummaryList =

  //#region PaginatedGrowthRateSummaryList

  [<CLIMutable>]
  type PaginatedGrowthRateSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : GrowthRateSummary[];
  }

  //#endregion
