namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemDetailHeldByPokemonInnerVersionDetailsInner

module ItemDetailHeldByPokemonInner =

  //#region ItemDetailHeldByPokemonInner


  type ItemDetail_held_by_pokemon_inner = {
    Pokemon : AbilityDetailPokemonInnerPokemon;
    VersionDetails : ItemDetailHeldByPokemonInnerVersionDetailsInner[];
  }
  //#endregion
