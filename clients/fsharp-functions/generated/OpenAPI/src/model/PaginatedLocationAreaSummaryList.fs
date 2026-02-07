namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaSummary

module PaginatedLocationAreaSummaryList =

  //#region PaginatedLocationAreaSummaryList

  [<CLIMutable>]
  type PaginatedLocationAreaSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : LocationAreaSummary[];
  }

  //#endregion
