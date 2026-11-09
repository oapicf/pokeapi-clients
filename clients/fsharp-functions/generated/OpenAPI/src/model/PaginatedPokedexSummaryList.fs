namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.string option

module PaginatedPokedexSummaryList =

  //#region PaginatedPokedexSummaryList

  [<CLIMutable>]
  type PaginatedPokedexSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokedexSummary[];
  }

  //#endregion
