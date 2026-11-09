namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSummary

module PokemonSpeciesVariety =

  //#region PokemonSpeciesVariety


  type PokemonSpeciesVariety = {
    IsDefault : bool;
    Pokemon : PokemonSummary;
  }
  //#endregion
