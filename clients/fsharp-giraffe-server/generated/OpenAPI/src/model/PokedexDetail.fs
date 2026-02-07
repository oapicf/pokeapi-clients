namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokedexDescription
open OpenAPI.Model.PokedexDetailPokemonEntriesInner
open OpenAPI.Model.PokedexName
open OpenAPI.Model.RegionSummary

module PokedexDetail =

  //#region PokedexDetail


  type PokedexDetail = {
    Id : int;
    Name : string;
    IsMainSeries : bool;
    Descriptions : PokedexDescription[];
    Names : PokedexName[];
    PokemonEntries : PokedexDetailPokemonEntriesInner[];
    Region : RegionSummary;
    VersionGroups : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
