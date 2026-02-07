namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSpeciesSummary

module PaginatedPokemonSpeciesSummaryList =

  //#region PaginatedPokemonSpeciesSummaryList


  type PaginatedPokemonSpeciesSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokemonSpeciesSummary[];
  }
  //#endregion
