namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.PokemonHeldItemVersion

module PokemonHeldItemSummary =

  //#region PokemonHeldItemSummary

  [<CLIMutable>]
  type PokemonHeldItemSummary = {
    [<JsonProperty(PropertyName = "item")>]
    Item : ItemSummary;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : PokemonHeldItemVersion[];
  }

  //#endregion
