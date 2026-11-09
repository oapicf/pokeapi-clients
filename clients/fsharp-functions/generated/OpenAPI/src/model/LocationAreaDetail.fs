namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaEncounterRate
open OpenAPI.Model.LocationAreaName
open OpenAPI.Model.LocationAreaPokemonEncounter
open OpenAPI.Model.LocationSummary

module LocationAreaDetail =

  //#region LocationAreaDetail

  [<CLIMutable>]
  type LocationAreaDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "game_index")>]
    GameIndex : int;
    [<JsonProperty(PropertyName = "encounter_method_rates")>]
    EncounterMethodRates : LocationAreaEncounterRate[];
    [<JsonProperty(PropertyName = "location")>]
    Location : LocationSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : LocationAreaName[];
    [<JsonProperty(PropertyName = "pokemon_encounters")>]
    PokemonEncounters : LocationAreaPokemonEncounter[];
  }

  //#endregion
