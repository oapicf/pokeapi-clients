namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokeathlonStatSummary

module PaginatedPokeathlonStatSummaryList =

  //#region PaginatedPokeathlonStatSummaryList


  type PaginatedPokeathlonStatSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokeathlonStatSummary[];
  }
  //#endregion
