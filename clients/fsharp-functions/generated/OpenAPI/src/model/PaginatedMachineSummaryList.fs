namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MachineSummary
open OpenAPI.Model.string option

module PaginatedMachineSummaryList =

  //#region PaginatedMachineSummaryList

  [<CLIMutable>]
  type PaginatedMachineSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MachineSummary[];
  }

  //#endregion
