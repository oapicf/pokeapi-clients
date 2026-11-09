namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.string option

module PaginatedTypeSummaryList =

  //#region PaginatedTypeSummaryList

  [<CLIMutable>]
  type PaginatedTypeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : TypeSummary[];
  }

  //#endregion
