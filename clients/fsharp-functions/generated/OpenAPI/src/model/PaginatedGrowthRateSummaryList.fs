namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GrowthRateSummary
open OpenAPI.Model.string option

module PaginatedGrowthRateSummaryList =

  //#region PaginatedGrowthRateSummaryList

  [<CLIMutable>]
  type PaginatedGrowthRateSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : GrowthRateSummary[];
  }

  //#endregion
