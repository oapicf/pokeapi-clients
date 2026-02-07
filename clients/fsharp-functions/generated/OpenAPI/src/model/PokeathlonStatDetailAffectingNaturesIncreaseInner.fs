namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokeathlonStatDetailAffectingNaturesIncreaseInner =

  //#region PokeathlonStatDetailAffectingNaturesIncreaseInner

  [<CLIMutable>]
  type PokeathlonStatDetailAffectingNaturesIncreaseInner = {
    [<JsonProperty(PropertyName = "max_change")>]
    MaxChange : int;
    [<JsonProperty(PropertyName = "nature")>]
    Nature : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
