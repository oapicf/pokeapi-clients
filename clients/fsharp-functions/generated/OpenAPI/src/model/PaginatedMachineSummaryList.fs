namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MachineSummary

module PaginatedMachineSummaryList =

  //#region PaginatedMachineSummaryList

  [<CLIMutable>]
  type PaginatedMachineSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : MachineSummary[];
  }

  //#endregion
