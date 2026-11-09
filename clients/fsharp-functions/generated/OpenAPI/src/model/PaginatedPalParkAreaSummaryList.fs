namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PalParkAreaSummary
open OpenAPI.Model.string option

module PaginatedPalParkAreaSummaryList =

  //#region PaginatedPalParkAreaSummaryList

  [<CLIMutable>]
  type PaginatedPalParkAreaSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PalParkAreaSummary[];
  }

  //#endregion
