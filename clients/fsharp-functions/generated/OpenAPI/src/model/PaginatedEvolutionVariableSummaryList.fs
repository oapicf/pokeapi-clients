namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionVariableSummary
open OpenAPI.Model.string option

module PaginatedEvolutionVariableSummaryList =

  //#region PaginatedEvolutionVariableSummaryList

  [<CLIMutable>]
  type PaginatedEvolutionVariableSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EvolutionVariableSummary[];
  }

  //#endregion
