namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module AbilityDetailPokemonInner =

  //#region AbilityDetailPokemonInner

  [<CLIMutable>]
  type AbilityDetailPokemonInner = {
    [<JsonProperty(PropertyName = "is_hidden")>]
    IsHidden : bool;
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
