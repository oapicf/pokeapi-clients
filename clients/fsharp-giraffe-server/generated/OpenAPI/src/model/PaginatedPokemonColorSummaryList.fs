namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonColorSummary

module PaginatedPokemonColorSummaryList =

  //#region PaginatedPokemonColorSummaryList


  type PaginatedPokemonColorSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokemonColorSummary[];
  }
  //#endregion
