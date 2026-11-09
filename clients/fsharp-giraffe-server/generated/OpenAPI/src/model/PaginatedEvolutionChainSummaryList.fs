namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionChainSummary
open OpenAPI.Model.string option

module PaginatedEvolutionChainSummaryList =

  //#region PaginatedEvolutionChainSummaryList


  type PaginatedEvolutionChainSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EvolutionChainSummary[];
  }
  //#endregion
