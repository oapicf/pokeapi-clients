namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionSummary

module PokemonHeldItemVersion =

  //#region PokemonHeldItemVersion


  type PokemonHeldItemVersion = {
    Rarity : int;
    Version : VersionSummary;
  }
  //#endregion
