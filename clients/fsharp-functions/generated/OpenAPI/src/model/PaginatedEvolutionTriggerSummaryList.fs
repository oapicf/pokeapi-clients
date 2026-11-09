namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionTriggerSummary
open OpenAPI.Model.string option

module PaginatedEvolutionTriggerSummaryList =

  //#region PaginatedEvolutionTriggerSummaryList

  [<CLIMutable>]
  type PaginatedEvolutionTriggerSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EvolutionTriggerSummary[];
  }

  //#endregion
