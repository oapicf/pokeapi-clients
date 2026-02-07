namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.LocationSummary
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.RegionName

module RegionDetail =

  //#region RegionDetail


  type RegionDetail = {
    Id : int;
    Name : string;
    Locations : LocationSummary[];
    MainGeneration : GenerationSummary;
    Names : RegionName[];
    Pokedexes : PokedexSummary[];
    VersionGroups : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
