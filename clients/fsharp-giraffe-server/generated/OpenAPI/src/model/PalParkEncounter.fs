namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.int option

module PalParkEncounter =

  //#region PalParkEncounter


  type PalParkEncounter = {
    BaseScore : int option;
    Rate : int;
    PokemonSpecies : PokemonSpeciesSummary;
  }
  //#endregion
