namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionChainSummary
open OpenAPI.Model.string option

module PaginatedEvolutionChainSummaryList =

  //#region PaginatedEvolutionChainSummaryList

  [<CLIMutable>]
  type PaginatedEvolutionChainSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EvolutionChainSummary[];
  }

  //#endregion
