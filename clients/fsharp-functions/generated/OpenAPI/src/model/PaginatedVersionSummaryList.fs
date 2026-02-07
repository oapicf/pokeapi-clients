namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionSummary

module PaginatedVersionSummaryList =

  //#region PaginatedVersionSummaryList

  [<CLIMutable>]
  type PaginatedVersionSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : VersionSummary[];
  }

  //#endregion
