namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonHabitatName
open OpenAPI.Model.PokemonSpeciesSummary

module PokemonHabitatDetail =

  //#region PokemonHabitatDetail


  type PokemonHabitatDetail = {
    Id : int;
    Name : string;
    Names : PokemonHabitatName[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
