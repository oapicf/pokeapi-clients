namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonDetailTypesInner =

  //#region PokemonDetailTypesInner

  [<CLIMutable>]
  type PokemonDetailTypesInner = {
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
