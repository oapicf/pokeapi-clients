namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonHabitatSummary
open OpenAPI.Model.string option

module PaginatedPokemonHabitatSummaryList =

  //#region PaginatedPokemonHabitatSummaryList


  type PaginatedPokemonHabitatSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PokemonHabitatSummary[];
  }
  //#endregion
