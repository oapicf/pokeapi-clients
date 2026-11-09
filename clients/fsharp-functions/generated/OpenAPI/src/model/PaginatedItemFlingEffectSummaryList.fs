namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemFlingEffectSummary
open OpenAPI.Model.string option

module PaginatedItemFlingEffectSummaryList =

  //#region PaginatedItemFlingEffectSummaryList

  [<CLIMutable>]
  type PaginatedItemFlingEffectSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemFlingEffectSummary[];
  }

  //#endregion
