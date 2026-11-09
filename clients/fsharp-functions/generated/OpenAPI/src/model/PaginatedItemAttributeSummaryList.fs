namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributeSummary
open OpenAPI.Model.string option

module PaginatedItemAttributeSummaryList =

  //#region PaginatedItemAttributeSummaryList

  [<CLIMutable>]
  type PaginatedItemAttributeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemAttributeSummary[];
  }

  //#endregion
