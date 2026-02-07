namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionGroupSummary

module PaginatedVersionGroupSummaryList =

  //#region PaginatedVersionGroupSummaryList

  [<CLIMutable>]
  type PaginatedVersionGroupSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : VersionGroupSummary[];
  }

  //#endregion
