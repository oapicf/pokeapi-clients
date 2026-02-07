namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerrySummary

module PaginatedBerrySummaryList =

  //#region PaginatedBerrySummaryList

  [<CLIMutable>]
  type PaginatedBerrySummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : BerrySummary[];
  }

  //#endregion
