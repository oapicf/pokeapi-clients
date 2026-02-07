namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveMetaAilmentName

module MoveMetaAilmentDetail =

  //#region MoveMetaAilmentDetail


  type MoveMetaAilmentDetail = {
    Id : int;
    Name : string;
    Moves : AbilityDetailPokemonInnerPokemon[];
    Names : MoveMetaAilmentName[];
  }
  //#endregion
