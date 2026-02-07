namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RegionSummary

module PaginatedRegionSummaryList =

  //#region PaginatedRegionSummaryList

  [<CLIMutable>]
  type PaginatedRegionSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : RegionSummary[];
  }

  //#endregion
