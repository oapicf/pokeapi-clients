namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonShapeAwesomeName
open OpenAPI.Model.PokemonShapeName
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
    AwesomeNames : PokemonShapeAwesomeName[];
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonShapeName[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
  }

  //#endregion
