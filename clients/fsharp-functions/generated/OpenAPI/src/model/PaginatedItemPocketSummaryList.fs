namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemPocketSummary

module PaginatedItemPocketSummaryList =

  //#region PaginatedItemPocketSummaryList

  [<CLIMutable>]
  type PaginatedItemPocketSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemPocketSummary[];
  }

  //#endregion
