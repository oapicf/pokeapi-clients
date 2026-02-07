namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module TypeDetailDamageRelations =

  //#region TypeDetailDamageRelations

  [<CLIMutable>]
  type TypeDetailDamageRelations = {
    [<JsonProperty(PropertyName = "no_damage_to")>]
    NoDamageTo : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "half_damage_to")>]
    HalfDamageTo : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "double_damage_to")>]
    DoubleDamageTo : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "no_damage_from")>]
    NoDamageFrom : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "half_damage_from")>]
    HalfDamageFrom : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "double_damage_from")>]
    DoubleDamageFrom : AbilityDetailPokemonInnerPokemon[];
  }

  //#endregion
