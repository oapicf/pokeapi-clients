namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EggGroupSummary
open OpenAPI.Model.string option

module PaginatedEggGroupSummaryList =

  //#region PaginatedEggGroupSummaryList

  [<CLIMutable>]
  type PaginatedEggGroupSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EggGroupSummary[];
  }

  //#endregion
