namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSummary

module PaginatedPokemonSummaryList =

  //#region PaginatedPokemonSummaryList


  type PaginatedPokemonSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokemonSummary[];
  }
  //#endregion
