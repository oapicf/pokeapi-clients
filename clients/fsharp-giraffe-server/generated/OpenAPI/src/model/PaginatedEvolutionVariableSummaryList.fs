namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionVariableSummary
open OpenAPI.Model.string option

module PaginatedEvolutionVariableSummaryList =

  //#region PaginatedEvolutionVariableSummaryList


  type PaginatedEvolutionVariableSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EvolutionVariableSummary[];
  }
  //#endregion
