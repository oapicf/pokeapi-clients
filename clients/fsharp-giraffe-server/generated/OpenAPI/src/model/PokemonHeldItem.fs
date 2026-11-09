namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonHeldItemVersion
open OpenAPI.Model.PokemonSummary

module PokemonHeldItem =

  //#region PokemonHeldItem


  type PokemonHeldItem = {
    Pokemon : PokemonSummary;
    VersionDetails : PokemonHeldItemVersion[];
  }
  //#endregion
