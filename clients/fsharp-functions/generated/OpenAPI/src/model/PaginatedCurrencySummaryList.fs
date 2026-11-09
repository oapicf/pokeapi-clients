namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CurrencySummary
open OpenAPI.Model.string option

module PaginatedCurrencySummaryList =

  //#region PaginatedCurrencySummaryList

  [<CLIMutable>]
  type PaginatedCurrencySummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : CurrencySummary[];
  }

  //#endregion
