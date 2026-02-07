namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionChainSummary

module PaginatedEvolutionChainSummaryList =

  //#region PaginatedEvolutionChainSummaryList


  type PaginatedEvolutionChainSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : EvolutionChainSummary[];
  }
  //#endregion
