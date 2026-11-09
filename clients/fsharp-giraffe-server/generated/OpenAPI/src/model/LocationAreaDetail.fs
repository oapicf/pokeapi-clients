namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaEncounterRate
open OpenAPI.Model.LocationAreaName
open OpenAPI.Model.LocationAreaPokemonEncounter
open OpenAPI.Model.LocationSummary

module LocationAreaDetail =

  //#region LocationAreaDetail


  type LocationAreaDetail = {
    Id : int;
    Name : string;
    GameIndex : int;
    EncounterMethodRates : LocationAreaEncounterRate[];
    Location : LocationSummary;
    Names : LocationAreaName[];
    PokemonEncounters : LocationAreaPokemonEncounter[];
  }
  //#endregion
