namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PalParkAreaDetailPokemonEncountersInner
open OpenAPI.Model.PalParkAreaName

module PalParkAreaDetail =

  //#region PalParkAreaDetail


  type PalParkAreaDetail = {
    Id : int;
    Name : string;
    Names : PalParkAreaName[];
    PokemonEncounters : PalParkAreaDetailPokemonEncountersInner[];
  }
  //#endregion
