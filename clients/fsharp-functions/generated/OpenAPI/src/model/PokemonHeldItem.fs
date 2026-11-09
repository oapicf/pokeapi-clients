namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonHeldItemVersion
open OpenAPI.Model.PokemonSummary

module PokemonHeldItem =

  //#region PokemonHeldItem

  [<CLIMutable>]
  type PokemonHeldItem = {
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : PokemonSummary;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : PokemonHeldItemVersion[];
  }

  //#endregion
