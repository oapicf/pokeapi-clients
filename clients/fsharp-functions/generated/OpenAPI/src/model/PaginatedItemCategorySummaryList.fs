namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemCategorySummary
open OpenAPI.Model.string option

module PaginatedItemCategorySummaryList =

  //#region PaginatedItemCategorySummaryList

  [<CLIMutable>]
  type PaginatedItemCategorySummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemCategorySummary[];
  }

  //#endregion
