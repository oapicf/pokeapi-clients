namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.LocationSummary
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.RegionName
open OpenAPI.Model.VersionGroupSummary

module RegionDetail =

  //#region RegionDetail


  type RegionDetail = {
    Id : int;
    Name : string;
    Locations : LocationSummary[];
    MainGeneration : GenerationSummary;
    Names : RegionName[];
    Pokedexes : PokedexSummary[];
    VersionGroups : VersionGroupSummary[];
  }
  //#endregion
