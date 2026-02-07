namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EggGroupSummary

module PaginatedEggGroupSummaryList =

  //#region PaginatedEggGroupSummaryList

  [<CLIMutable>]
  type PaginatedEggGroupSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : EggGroupSummary[];
  }

  //#endregion
