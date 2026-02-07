namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionSummary

module PaginatedEncounterConditionSummaryList =

  //#region PaginatedEncounterConditionSummaryList

  [<CLIMutable>]
  type PaginatedEncounterConditionSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : EncounterConditionSummary[];
  }

  //#endregion
