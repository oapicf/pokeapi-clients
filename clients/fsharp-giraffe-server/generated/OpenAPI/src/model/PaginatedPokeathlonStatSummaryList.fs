namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokeathlonStatSummary
open OpenAPI.Model.string option

module PaginatedPokeathlonStatSummaryList =

  //#region PaginatedPokeathlonStatSummaryList


  type PaginatedPokeathlonStatSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokeathlonStatSummary[];
  }
  //#endregion
