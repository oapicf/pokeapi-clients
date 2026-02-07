namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemFlingEffectSummary

module PaginatedItemFlingEffectSummaryList =

  //#region PaginatedItemFlingEffectSummaryList

  [<CLIMutable>]
  type PaginatedItemFlingEffectSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemFlingEffectSummary[];
  }

  //#endregion
