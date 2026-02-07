namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonDetailAbilitiesInner =

  //#region PokemonDetailAbilitiesInner


  type PokemonDetail_abilities_inner = {
    Ability : AbilityDetailPokemonInnerPokemon;
    IsHidden : bool;
    Slot : int;
  }
  //#endregion
