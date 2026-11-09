namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenderSummary
open OpenAPI.Model.string option

module PaginatedGenderSummaryList =

  //#region PaginatedGenderSummaryList

  [<CLIMutable>]
  type PaginatedGenderSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : GenderSummary[];
  }

  //#endregion
