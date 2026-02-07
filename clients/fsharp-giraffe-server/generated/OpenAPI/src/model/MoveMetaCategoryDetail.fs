namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveMetaCategoryDescription

module MoveMetaCategoryDetail =

  //#region MoveMetaCategoryDetail


  type MoveMetaCategoryDetail = {
    Id : int;
    Name : string;
    Descriptions : MoveMetaCategoryDescription[];
    Moves : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
