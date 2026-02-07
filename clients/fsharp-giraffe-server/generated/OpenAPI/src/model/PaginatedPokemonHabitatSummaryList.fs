namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonHabitatSummary

module PaginatedPokemonHabitatSummaryList =

  //#region PaginatedPokemonHabitatSummaryList


  type PaginatedPokemonHabitatSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PokemonHabitatSummary[];
  }
  //#endregion
