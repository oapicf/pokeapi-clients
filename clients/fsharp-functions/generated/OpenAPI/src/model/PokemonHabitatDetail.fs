namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonHabitatName
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonHabitatDetail =

  //#region PokemonHabitatDetail

  [<CLIMutable>]
  type PokemonHabitatDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonHabitatName[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
  }

  //#endregion
