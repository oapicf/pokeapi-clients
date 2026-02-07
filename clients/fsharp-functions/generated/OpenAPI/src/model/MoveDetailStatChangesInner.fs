namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module MoveDetailStatChangesInner =

  //#region MoveDetailStatChangesInner

  [<CLIMutable>]
  type MoveDetailStatChangesInner = {
    [<JsonProperty(PropertyName = "change")>]
    Change : int;
    [<JsonProperty(PropertyName = "stat")>]
    Stat : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
