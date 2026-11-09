namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.string option

module PaginatedBerryFlavorSummaryList =

  //#region PaginatedBerryFlavorSummaryList

  [<CLIMutable>]
  type PaginatedBerryFlavorSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : BerryFlavorSummary[];
  }

  //#endregion
