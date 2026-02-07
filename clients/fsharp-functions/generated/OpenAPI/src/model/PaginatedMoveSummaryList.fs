namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary

module PaginatedMoveSummaryList =

  //#region PaginatedMoveSummaryList

  [<CLIMutable>]
  type PaginatedMoveSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveSummary[];
  }

  //#endregion
