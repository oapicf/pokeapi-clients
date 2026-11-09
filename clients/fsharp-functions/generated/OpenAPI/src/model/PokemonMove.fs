namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.PokemonMoveVersionGroup

module PokemonMove =

  //#region PokemonMove

  [<CLIMutable>]
  type PokemonMove = {
    [<JsonProperty(PropertyName = "move")>]
    Move : MoveSummary;
    [<JsonProperty(PropertyName = "version_group_details")>]
    VersionGroupDetails : PokemonMoveVersionGroup[];
  }

  //#endregion
