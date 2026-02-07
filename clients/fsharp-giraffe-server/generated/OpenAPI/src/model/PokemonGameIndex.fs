namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionSummary

module PokemonGameIndex =

  //#region PokemonGameIndex


  type PokemonGameIndex = {
    GameIndex : int;
    Version : VersionSummary;
  }
  //#endregion
