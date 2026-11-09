namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionSummary
open OpenAPI.Model.string option

module PaginatedEncounterConditionSummaryList =

  //#region PaginatedEncounterConditionSummaryList


  type PaginatedEncounterConditionSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EncounterConditionSummary[];
  }
  //#endregion
