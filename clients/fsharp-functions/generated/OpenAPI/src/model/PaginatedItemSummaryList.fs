namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemSummary

module PaginatedItemSummaryList =

  //#region PaginatedItemSummaryList

  [<CLIMutable>]
  type PaginatedItemSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemSummary[];
  }

  //#endregion
