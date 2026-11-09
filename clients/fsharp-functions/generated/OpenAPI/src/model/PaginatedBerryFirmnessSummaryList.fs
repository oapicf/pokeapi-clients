namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFirmnessSummary
open OpenAPI.Model.string option

module PaginatedBerryFirmnessSummaryList =

  //#region PaginatedBerryFirmnessSummaryList

  [<CLIMutable>]
  type PaginatedBerryFirmnessSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : BerryFirmnessSummary[];
  }

  //#endregion
