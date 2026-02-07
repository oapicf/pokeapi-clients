namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokedexSummary

module PaginatedPokedexSummaryList =

  //#region PaginatedPokedexSummaryList


  type PaginatedPokedexSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokedexSummary[];
  }
  //#endregion
