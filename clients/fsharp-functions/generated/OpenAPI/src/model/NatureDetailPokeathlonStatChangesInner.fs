namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module NatureDetailPokeathlonStatChangesInner =

  //#region NatureDetailPokeathlonStatChangesInner

  [<CLIMutable>]
  type NatureDetailPokeathlonStatChangesInner = {
    [<JsonProperty(PropertyName = "max_change")>]
    MaxChange : int;
    [<JsonProperty(PropertyName = "pokeathlon_stat")>]
    PokeathlonStat : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
