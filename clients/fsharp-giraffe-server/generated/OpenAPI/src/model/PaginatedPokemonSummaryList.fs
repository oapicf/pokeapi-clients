namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSummary
open OpenAPI.Model.string option

module PaginatedPokemonSummaryList =

  //#region PaginatedPokemonSummaryList


  type PaginatedPokemonSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokemonSummary[];
  }
  //#endregion
