namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonShapeDetailAwesomeNamesInner
open OpenAPI.Model.PokemonShapeDetailNamesInner
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonShapeDetail =

  //#region PokemonShapeDetail

  [<CLIMutable>]
  type PokemonShapeDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "awesome_names")>]
    AwesomeNames : PokemonShapeDetailAwesomeNamesInner[];
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonShapeDetailNamesInner[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
  }

  //#endregion
