namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.VersionSummary
open OpenAPI.Model.int option

module VersionGroupDetail =

  //#region VersionGroupDetail


  type VersionGroupDetail = {
    Id : int;
    Name : string;
    Order : int option;
    Generation : GenerationSummary;
    MoveLearnMethods : AbilityDetailPokemonInnerPokemon[];
    Pokedexes : AbilityDetailPokemonInnerPokemon[];
    Regions : AbilityDetailPokemonInnerPokemon[];
    Versions : VersionSummary[];
  }
  //#endregion
