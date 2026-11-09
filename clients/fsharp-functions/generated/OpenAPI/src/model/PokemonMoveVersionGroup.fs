namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveLearnMethodSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module PokemonMoveVersionGroup =

  //#region PokemonMoveVersionGroup

  [<CLIMutable>]
  type PokemonMoveVersionGroup = {
    [<JsonProperty(PropertyName = "level_learned_at")>]
    LevelLearnedAt : int;
    [<JsonProperty(PropertyName = "move_learn_method")>]
    MoveLearnMethod : MoveLearnMethodSummary;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
  }

  //#endregion
