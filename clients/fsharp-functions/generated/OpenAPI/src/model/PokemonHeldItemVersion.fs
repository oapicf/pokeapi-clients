namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionSummary

module PokemonHeldItemVersion =

  //#region PokemonHeldItemVersion

  [<CLIMutable>]
  type PokemonHeldItemVersion = {
    [<JsonProperty(PropertyName = "rarity")>]
    Rarity : int;
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
  }

  //#endregion
