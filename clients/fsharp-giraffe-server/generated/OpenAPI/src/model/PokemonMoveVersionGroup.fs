namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveLearnMethodSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module PokemonMoveVersionGroup =

  //#region PokemonMoveVersionGroup


  type PokemonMoveVersionGroup = {
    LevelLearnedAt : int;
    MoveLearnMethod : MoveLearnMethodSummary;
    VersionGroup : VersionGroupSummary;
    Order : int option;
  }
  //#endregion
