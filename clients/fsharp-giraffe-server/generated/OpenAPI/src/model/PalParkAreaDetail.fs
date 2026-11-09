namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PalParkAreaName
open OpenAPI.Model.PalParkEncounter

module PalParkAreaDetail =

  //#region PalParkAreaDetail


  type PalParkAreaDetail = {
    Id : int;
    Name : string;
    Names : PalParkAreaName[];
    PokemonEncounters : PalParkEncounter[];
  }
  //#endregion
