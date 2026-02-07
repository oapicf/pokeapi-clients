namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionValueSummary

module PaginatedEncounterConditionValueSummaryList =

  //#region PaginatedEncounterConditionValueSummaryList

  [<CLIMutable>]
  type PaginatedEncounterConditionValueSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : EncounterConditionValueSummary[];
  }

  //#endregion
