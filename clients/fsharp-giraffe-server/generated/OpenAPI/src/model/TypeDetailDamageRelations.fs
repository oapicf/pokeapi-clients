namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module TypeDetailDamageRelations =

  //#region TypeDetailDamageRelations


  type TypeDetail_damage_relations = {
    NoDamageTo : AbilityDetailPokemonInnerPokemon[];
    HalfDamageTo : AbilityDetailPokemonInnerPokemon[];
    DoubleDamageTo : AbilityDetailPokemonInnerPokemon[];
    NoDamageFrom : AbilityDetailPokemonInnerPokemon[];
    HalfDamageFrom : AbilityDetailPokemonInnerPokemon[];
    DoubleDamageFrom : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
