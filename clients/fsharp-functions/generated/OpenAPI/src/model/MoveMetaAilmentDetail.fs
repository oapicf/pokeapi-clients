namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveMetaAilmentName

module MoveMetaAilmentDetail =

  //#region MoveMetaAilmentDetail

  [<CLIMutable>]
  type MoveMetaAilmentDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "moves")>]
    Moves : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveMetaAilmentName[];
  }

  //#endregion
