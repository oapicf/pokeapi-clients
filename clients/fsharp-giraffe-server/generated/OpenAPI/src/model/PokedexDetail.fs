namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokedexDescription
open OpenAPI.Model.PokedexName
open OpenAPI.Model.PokemonDexNumber
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.VersionGroupSummary

module PokedexDetail =

  //#region PokedexDetail


  type PokedexDetail = {
    Id : int;
    Name : string;
    IsMainSeries : bool;
    Descriptions : PokedexDescription[];
    Names : PokedexName[];
    PokemonEntries : PokemonDexNumber[];
    Region : RegionSummary;
    VersionGroups : VersionGroupSummary[];
  }
  //#endregion
