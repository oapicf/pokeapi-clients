namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionValueSummary

module PaginatedEncounterConditionValueSummaryList =

  //#region PaginatedEncounterConditionValueSummaryList


  type PaginatedEncounterConditionValueSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : EncounterConditionValueSummary[];
  }
  //#endregion
