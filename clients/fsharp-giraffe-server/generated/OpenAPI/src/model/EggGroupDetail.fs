namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EggGroupName
open OpenAPI.Model.PokemonSpeciesSummary

module EggGroupDetail =

  //#region EggGroupDetail


  type EggGroupDetail = {
    Id : int;
    Name : string;
    Names : EggGroupName[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
