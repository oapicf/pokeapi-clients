namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionTriggerSummary

module PaginatedEvolutionTriggerSummaryList =

  //#region PaginatedEvolutionTriggerSummaryList

  [<CLIMutable>]
  type PaginatedEvolutionTriggerSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : EvolutionTriggerSummary[];
  }

  //#endregion
