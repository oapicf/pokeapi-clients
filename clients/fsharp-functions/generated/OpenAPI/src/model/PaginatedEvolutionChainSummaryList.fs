namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionChainSummary

module PaginatedEvolutionChainSummaryList =

  //#region PaginatedEvolutionChainSummaryList

  [<CLIMutable>]
  type PaginatedEvolutionChainSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : EvolutionChainSummary[];
  }

  //#endregion
