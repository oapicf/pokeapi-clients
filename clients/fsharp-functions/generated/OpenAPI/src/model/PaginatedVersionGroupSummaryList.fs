namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.string option

module PaginatedVersionGroupSummaryList =

  //#region PaginatedVersionGroupSummaryList

  [<CLIMutable>]
  type PaginatedVersionGroupSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : VersionGroupSummary[];
  }

  //#endregion
