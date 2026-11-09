namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonFormSummary
open OpenAPI.Model.string option

module PaginatedPokemonFormSummaryList =

  //#region PaginatedPokemonFormSummaryList


  type PaginatedPokemonFormSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokemonFormSummary[];
  }
  //#endregion
