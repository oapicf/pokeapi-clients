namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonFormSummary

module PaginatedPokemonFormSummaryList =

  //#region PaginatedPokemonFormSummaryList


  type PaginatedPokemonFormSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokemonFormSummary[];
  }
  //#endregion
