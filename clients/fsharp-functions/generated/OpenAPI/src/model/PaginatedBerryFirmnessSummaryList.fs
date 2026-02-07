namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFirmnessSummary

module PaginatedBerryFirmnessSummaryList =

  //#region PaginatedBerryFirmnessSummaryList

  [<CLIMutable>]
  type PaginatedBerryFirmnessSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : BerryFirmnessSummary[];
  }

  //#endregion
