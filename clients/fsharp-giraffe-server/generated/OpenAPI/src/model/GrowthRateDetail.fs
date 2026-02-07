namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Experience
open OpenAPI.Model.GrowthRateDescription
open OpenAPI.Model.PokemonSpeciesSummary

module GrowthRateDetail =

  //#region GrowthRateDetail


  type GrowthRateDetail = {
    Id : int;
    Name : string;
    Formula : string;
    Descriptions : GrowthRateDescription[];
    Levels : Experience[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
