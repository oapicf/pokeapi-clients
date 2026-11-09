namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilitySummary
open OpenAPI.Model.string option

module PaginatedAbilitySummaryList =

  //#region PaginatedAbilitySummaryList

  [<CLIMutable>]
  type PaginatedAbilitySummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : AbilitySummary[];
  }

  //#endregion
