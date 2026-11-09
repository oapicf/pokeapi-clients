namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.string option

module PaginatedRegionSummaryList =

  //#region PaginatedRegionSummaryList

  [<CLIMutable>]
  type PaginatedRegionSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : RegionSummary[];
  }

  //#endregion
