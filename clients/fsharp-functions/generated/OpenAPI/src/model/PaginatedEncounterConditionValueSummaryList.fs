namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionValueSummary
open OpenAPI.Model.string option

module PaginatedEncounterConditionValueSummaryList =

  //#region PaginatedEncounterConditionValueSummaryList

  [<CLIMutable>]
  type PaginatedEncounterConditionValueSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EncounterConditionValueSummary[];
  }

  //#endregion
