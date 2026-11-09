namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSpeciesSummary

module GenderPokemonSpecies =

  //#region GenderPokemonSpecies


  type GenderPokemonSpecies = {
    Rate : int;
    PokemonSpecies : PokemonSpeciesSummary;
  }
  //#endregion
