namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module MoveDetailContestCombosNormal =

  //#region MoveDetailContestCombosNormal

  [<CLIMutable>]
  type MoveDetailContestCombosNormal = {
    [<JsonProperty(PropertyName = "use_before")>]
    UseBefore : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "use_after")>]
    UseAfter : AbilityDetailPokemonInnerPokemon[];
  }

  //#endregion
