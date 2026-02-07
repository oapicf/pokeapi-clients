namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TypeSummary

module PaginatedTypeSummaryList =

  //#region PaginatedTypeSummaryList

  [<CLIMutable>]
  type PaginatedTypeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : TypeSummary[];
  }

  //#endregion
