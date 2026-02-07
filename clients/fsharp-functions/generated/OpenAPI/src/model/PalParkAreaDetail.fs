namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PalParkAreaDetailPokemonEncountersInner
open OpenAPI.Model.PalParkAreaName

module PalParkAreaDetail =

  //#region PalParkAreaDetail

  [<CLIMutable>]
  type PalParkAreaDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : PalParkAreaName[];
    [<JsonProperty(PropertyName = "pokemon_encounters")>]
    PokemonEncounters : PalParkAreaDetailPokemonEncountersInner[];
  }

  //#endregion
