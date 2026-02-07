namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.TypeDetailPastDamageRelationsInnerDamageRelations

module TypeDetailPastDamageRelationsInner =

  //#region TypeDetailPastDamageRelationsInner

  [<CLIMutable>]
  type TypeDetailPastDamageRelationsInner = {
    [<JsonProperty(PropertyName = "generation")>]
    Generation : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "damage_relations")>]
    DamageRelations : TypeDetailPastDamageRelationsInnerDamageRelations;
  }

  //#endregion
