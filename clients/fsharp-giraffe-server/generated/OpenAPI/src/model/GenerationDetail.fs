namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilitySummary
open OpenAPI.Model.GenerationName
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary

module GenerationDetail =

  //#region GenerationDetail


  type GenerationDetail = {
    Id : int;
    Name : string;
    Abilities : AbilitySummary[];
    MainRegion : RegionSummary;
    Moves : MoveSummary[];
    Names : GenerationName[];
    PokemonSpecies : PokemonSpeciesSummary[];
    Types : TypeSummary[];
    VersionGroups : VersionGroupSummary[];
  }
  //#endregion
