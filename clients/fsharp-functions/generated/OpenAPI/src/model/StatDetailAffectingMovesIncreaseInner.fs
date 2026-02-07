namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module StatDetailAffectingMovesIncreaseInner =

  //#region StatDetailAffectingMovesIncreaseInner

  [<CLIMutable>]
  type StatDetailAffectingMovesIncreaseInner = {
    [<JsonProperty(PropertyName = "change")>]
    Change : int;
    [<JsonProperty(PropertyName = "move")>]
    Move : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
