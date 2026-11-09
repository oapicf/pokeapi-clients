namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemPocketSummary
open OpenAPI.Model.string option

module PaginatedItemPocketSummaryList =

  //#region PaginatedItemPocketSummaryList

  [<CLIMutable>]
  type PaginatedItemPocketSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemPocketSummary[];
  }

  //#endregion
