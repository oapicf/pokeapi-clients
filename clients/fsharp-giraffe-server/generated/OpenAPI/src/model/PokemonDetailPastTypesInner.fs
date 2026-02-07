namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokemonDetailTypesInner

module PokemonDetailPastTypesInner =

  //#region PokemonDetailPastTypesInner


  type PokemonDetail_past_types_inner = {
    Generation : AbilityDetailPokemonInnerPokemon;
    Types : PokemonDetailTypesInner[];
  }
  //#endregion
