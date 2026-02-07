namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonShapeSummary

module PaginatedPokemonShapeSummaryList =

  //#region PaginatedPokemonShapeSummaryList


  type PaginatedPokemonShapeSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokemonShapeSummary[];
  }
  //#endregion
