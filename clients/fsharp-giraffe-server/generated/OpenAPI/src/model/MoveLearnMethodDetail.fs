namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveLearnMethodDescription
open OpenAPI.Model.MoveLearnMethodName

module MoveLearnMethodDetail =

  //#region MoveLearnMethodDetail


  type MoveLearnMethodDetail = {
    Id : int;
    Name : string;
    Names : MoveLearnMethodName[];
    Descriptions : MoveLearnMethodDescription[];
    VersionGroups : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
