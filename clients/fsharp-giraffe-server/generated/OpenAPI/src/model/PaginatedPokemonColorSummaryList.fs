namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonColorSummary
open OpenAPI.Model.string option

module PaginatedPokemonColorSummaryList =

  //#region PaginatedPokemonColorSummaryList


  type PaginatedPokemonColorSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokemonColorSummary[];
  }
  //#endregion
