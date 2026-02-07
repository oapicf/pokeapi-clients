namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationSummary

module PaginatedLocationSummaryList =

  //#region PaginatedLocationSummaryList

  [<CLIMutable>]
  type PaginatedLocationSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : LocationSummary[];
  }

  //#endregion
