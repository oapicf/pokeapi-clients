namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PalParkAreaSummary

module PaginatedPalParkAreaSummaryList =

  //#region PaginatedPalParkAreaSummaryList

  [<CLIMutable>]
  type PaginatedPalParkAreaSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PalParkAreaSummary[];
  }

  //#endregion
