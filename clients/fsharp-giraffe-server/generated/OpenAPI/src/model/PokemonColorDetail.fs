namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonColorName
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonColorDetail =

  //#region PokemonColorDetail


  type PokemonColorDetail = {
    Id : int;
    Name : string;
    Names : PokemonColorName[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
