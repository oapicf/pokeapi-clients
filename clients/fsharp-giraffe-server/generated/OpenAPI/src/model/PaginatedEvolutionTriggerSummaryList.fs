namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionTriggerSummary

module PaginatedEvolutionTriggerSummaryList =

  //#region PaginatedEvolutionTriggerSummaryList


  type PaginatedEvolutionTriggerSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : EvolutionTriggerSummary[];
  }
  //#endregion
