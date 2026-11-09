namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonShapeAwesomeName
open OpenAPI.Model.PokemonShapeName
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonShapeDetail =

  //#region PokemonShapeDetail


  type PokemonShapeDetail = {
    Id : int;
    Name : string;
    AwesomeNames : PokemonShapeAwesomeName[];
    Names : PokemonShapeName[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
