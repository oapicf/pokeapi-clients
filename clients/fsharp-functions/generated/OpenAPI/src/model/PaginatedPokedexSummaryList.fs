namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokedexSummary

module PaginatedPokedexSummaryList =

  //#region PaginatedPokedexSummaryList

  [<CLIMutable>]
  type PaginatedPokedexSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokedexSummary[];
  }

  //#endregion
