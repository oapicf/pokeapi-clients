namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionSummary
open OpenAPI.Model.string option

module PaginatedVersionSummaryList =

  //#region PaginatedVersionSummaryList

  [<CLIMutable>]
  type PaginatedVersionSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : VersionSummary[];
  }

  //#endregion
