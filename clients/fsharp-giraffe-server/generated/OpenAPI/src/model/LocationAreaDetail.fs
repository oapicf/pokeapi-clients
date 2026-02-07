namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaDetailEncounterMethodRatesInner
open OpenAPI.Model.LocationAreaDetailPokemonEncountersInner
open OpenAPI.Model.LocationAreaName
open OpenAPI.Model.LocationSummary

module LocationAreaDetail =

  //#region LocationAreaDetail


  type LocationAreaDetail = {
    Id : int;
    Name : string;
    GameIndex : int;
    EncounterMethodRates : LocationAreaDetailEncounterMethodRatesInner[];
    Location : LocationSummary;
    Names : LocationAreaName[];
    PokemonEncounters : LocationAreaDetailPokemonEncountersInner[];
  }
  //#endregion
