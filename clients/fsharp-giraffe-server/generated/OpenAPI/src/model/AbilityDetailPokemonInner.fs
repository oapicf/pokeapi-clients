namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module AbilityDetailPokemonInner =

  //#region AbilityDetailPokemonInner


  type AbilityDetail_pokemon_inner = {
    IsHidden : bool;
    Slot : int;
    Pokemon : AbilityDetailPokemonInnerPokemon;
  }
  //#endregion
