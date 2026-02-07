namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemDetailHeldByPokemonInnerVersionDetailsInner

module PokemonDetailHeldItems =

  //#region PokemonDetailHeldItems


  type PokemonDetail_held_items = {
    Item : AbilityDetailPokemonInnerPokemon;
    VersionDetails : ItemDetailHeldByPokemonInnerVersionDetailsInner[];
  }
  //#endregion
