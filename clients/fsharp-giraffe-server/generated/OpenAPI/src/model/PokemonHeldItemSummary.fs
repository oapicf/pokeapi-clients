namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.PokemonHeldItemVersion

module PokemonHeldItemSummary =

  //#region PokemonHeldItemSummary


  type PokemonHeldItemSummary = {
    Item : ItemSummary;
    VersionDetails : PokemonHeldItemVersion[];
  }
  //#endregion
