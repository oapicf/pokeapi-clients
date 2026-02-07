namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionSummary

module PaginatedEncounterConditionSummaryList =

  //#region PaginatedEncounterConditionSummaryList


  type PaginatedEncounterConditionSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : EncounterConditionSummary[];
  }
  //#endregion
