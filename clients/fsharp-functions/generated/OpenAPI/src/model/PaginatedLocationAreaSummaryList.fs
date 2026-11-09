namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaSummary
open OpenAPI.Model.string option

module PaginatedLocationAreaSummaryList =

  //#region PaginatedLocationAreaSummaryList

  [<CLIMutable>]
  type PaginatedLocationAreaSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : LocationAreaSummary[];
  }

  //#endregion
