namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenderSummary

module PaginatedGenderSummaryList =

  //#region PaginatedGenderSummaryList

  [<CLIMutable>]
  type PaginatedGenderSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : GenderSummary[];
  }

  //#endregion
