namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerrySummary
open OpenAPI.Model.string option

module PaginatedBerrySummaryList =

  //#region PaginatedBerrySummaryList

  [<CLIMutable>]
  type PaginatedBerrySummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : BerrySummary[];
  }

  //#endregion
