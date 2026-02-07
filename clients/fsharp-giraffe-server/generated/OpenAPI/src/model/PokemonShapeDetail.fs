namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonShapeDetailAwesomeNamesInner
open OpenAPI.Model.PokemonShapeDetailNamesInner
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonShapeDetail =

  //#region PokemonShapeDetail


  type PokemonShapeDetail = {
    Id : int;
    Name : string;
    AwesomeNames : PokemonShapeDetailAwesomeNamesInner[];
    Names : PokemonShapeDetailNamesInner[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
