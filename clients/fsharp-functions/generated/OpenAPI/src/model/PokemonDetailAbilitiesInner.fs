namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonDetailAbilitiesInner =

  //#region PokemonDetailAbilitiesInner

  [<CLIMutable>]
  type PokemonDetailAbilitiesInner = {
    [<JsonProperty(PropertyName = "ability")>]
    Ability : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "is_hidden")>]
    IsHidden : bool;
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
  }

  //#endregion
