namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.TypeDetailPastDamageRelationsInnerDamageRelations

module TypeDetailPastDamageRelationsInner =

  //#region TypeDetailPastDamageRelationsInner


  type TypeDetail_past_damage_relations_inner = {
    Generation : AbilityDetailPokemonInnerPokemon;
    DamageRelations : TypeDetailPastDamageRelationsInnerDamageRelations;
  }
  //#endregion
