namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.string option

module PaginatedPokedexSummaryList =

  //#region PaginatedPokedexSummaryList


  type PaginatedPokedexSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokedexSummary[];
  }
  //#endregion
