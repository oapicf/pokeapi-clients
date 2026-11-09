namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NatureSummary
open OpenAPI.Model.string option

module PaginatedNatureSummaryList =

  //#region PaginatedNatureSummaryList

  [<CLIMutable>]
  type PaginatedNatureSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : NatureSummary[];
  }

  //#endregion
