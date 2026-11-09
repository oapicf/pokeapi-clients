namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSummary

module TypePokemon =

  //#region TypePokemon


  type TypePokemon = {
    Slot : int;
    Pokemon : PokemonSummary;
  }
  //#endregion
