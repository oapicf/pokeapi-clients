namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonShapeSummary
open OpenAPI.Model.string option

module PaginatedPokemonShapeSummaryList =

  //#region PaginatedPokemonShapeSummaryList


  type PaginatedPokemonShapeSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokemonShapeSummary[];
  }
  //#endregion
