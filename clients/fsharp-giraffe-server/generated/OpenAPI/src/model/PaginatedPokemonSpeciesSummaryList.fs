namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.string option

module PaginatedPokemonSpeciesSummaryList =

  //#region PaginatedPokemonSpeciesSummaryList


  type PaginatedPokemonSpeciesSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokemonSpeciesSummary[];
  }
  //#endregion
