namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokemonDetailAbilitiesInner

module PokemonDetailPastAbilitiesInner =

  //#region PokemonDetailPastAbilitiesInner


  type PokemonDetail_past_abilities_inner = {
    Abilities : PokemonDetailAbilitiesInner[];
    Generation : AbilityDetailPokemonInnerPokemon;
  }
  //#endregion
