namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.PokemonMoveVersionGroup

module PokemonMove =

  //#region PokemonMove


  type PokemonMove = {
    Move : MoveSummary;
    VersionGroupDetails : PokemonMoveVersionGroup[];
  }
  //#endregion
