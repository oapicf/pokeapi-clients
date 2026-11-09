namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionValueSummary
open OpenAPI.Model.string option

module PaginatedEncounterConditionValueSummaryList =

  //#region PaginatedEncounterConditionValueSummaryList


  type PaginatedEncounterConditionValueSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EncounterConditionValueSummary[];
  }
  //#endregion
