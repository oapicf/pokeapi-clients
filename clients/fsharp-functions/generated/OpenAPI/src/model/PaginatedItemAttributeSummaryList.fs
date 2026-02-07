namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributeSummary

module PaginatedItemAttributeSummaryList =

  //#region PaginatedItemAttributeSummaryList

  [<CLIMutable>]
  type PaginatedItemAttributeSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : ItemAttributeSummary[];
  }

  //#endregion
