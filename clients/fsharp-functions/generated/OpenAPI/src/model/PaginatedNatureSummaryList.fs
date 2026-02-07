namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NatureSummary

module PaginatedNatureSummaryList =

  //#region PaginatedNatureSummaryList

  [<CLIMutable>]
  type PaginatedNatureSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : NatureSummary[];
  }

  //#endregion
