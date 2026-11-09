namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.MoveLearnMethodSummary
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.VersionSummary
open OpenAPI.Model.int option

module VersionGroupDetail =

  //#region VersionGroupDetail


  type VersionGroupDetail = {
    Id : int;
    Name : string;
    Order : int option;
    Generation : GenerationSummary;
    MoveLearnMethods : MoveLearnMethodSummary[];
    Pokedexes : PokedexSummary[];
    Regions : RegionSummary[];
    Versions : VersionSummary[];
  }
  //#endregion
