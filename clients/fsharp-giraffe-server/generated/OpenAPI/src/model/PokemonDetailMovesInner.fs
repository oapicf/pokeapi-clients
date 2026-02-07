namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokemonDetailMovesInnerVersionGroupDetailsInner

module PokemonDetailMovesInner =

  //#region PokemonDetailMovesInner


  type PokemonDetail_moves_inner = {
    Move : AbilityDetailPokemonInnerPokemon;
    VersionGroupDetails : PokemonDetailMovesInnerVersionGroupDetailsInner[];
  }
  //#endregion
