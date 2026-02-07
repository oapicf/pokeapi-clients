namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionSummary

module PokemonGameIndex =

  //#region PokemonGameIndex

  [<CLIMutable>]
  type PokemonGameIndex = {
    [<JsonProperty(PropertyName = "game_index")>]
    GameIndex : int;
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
  }

  //#endregion
