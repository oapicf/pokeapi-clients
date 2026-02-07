namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EggGroupDetailPokemonSpeciesInner
open OpenAPI.Model.EggGroupName

module EggGroupDetail =

  //#region EggGroupDetail


  type EggGroupDetail = {
    Id : int;
    Name : string;
    Names : EggGroupName[];
    PokemonSpecies : EggGroupDetailPokemonSpeciesInner[];
  }
  //#endregion
