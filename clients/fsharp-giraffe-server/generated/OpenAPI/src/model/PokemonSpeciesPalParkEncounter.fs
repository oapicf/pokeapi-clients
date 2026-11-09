namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PalParkAreaSummary
open OpenAPI.Model.int option

module PokemonSpeciesPalParkEncounter =

  //#region PokemonSpeciesPalParkEncounter


  type PokemonSpeciesPalParkEncounter = {
    BaseScore : int option;
    Rate : int;
    Area : PalParkAreaSummary;
  }
  //#endregion
