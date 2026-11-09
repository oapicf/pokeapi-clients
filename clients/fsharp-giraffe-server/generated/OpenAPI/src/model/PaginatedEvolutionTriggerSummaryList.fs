namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionTriggerSummary
open OpenAPI.Model.string option

module PaginatedEvolutionTriggerSummaryList =

  //#region PaginatedEvolutionTriggerSummaryList


  type PaginatedEvolutionTriggerSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EvolutionTriggerSummary[];
  }
  //#endregion
