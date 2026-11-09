namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionSummary
open OpenAPI.Model.string option

module PaginatedEncounterConditionSummaryList =

  //#region PaginatedEncounterConditionSummaryList

  [<CLIMutable>]
  type PaginatedEncounterConditionSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EncounterConditionSummary[];
  }

  //#endregion
