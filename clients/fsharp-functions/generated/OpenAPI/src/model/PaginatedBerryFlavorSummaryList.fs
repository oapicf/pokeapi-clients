namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorSummary

module PaginatedBerryFlavorSummaryList =

  //#region PaginatedBerryFlavorSummaryList

  [<CLIMutable>]
  type PaginatedBerryFlavorSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : BerryFlavorSummary[];
  }

  //#endregion
