namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonColorName
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonColorDetail =

  //#region PokemonColorDetail

  [<CLIMutable>]
  type PokemonColorDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonColorName[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
  }

  //#endregion
