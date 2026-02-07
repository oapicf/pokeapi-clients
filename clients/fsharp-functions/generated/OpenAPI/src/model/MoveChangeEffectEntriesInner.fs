namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module MoveChangeEffectEntriesInner =

  //#region MoveChangeEffectEntriesInner

  [<CLIMutable>]
  type MoveChangeEffectEntriesInner = {
    [<JsonProperty(PropertyName = "effect")>]
    Effect : string;
    [<JsonProperty(PropertyName = "short_effect")>]
    ShortEffect : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
