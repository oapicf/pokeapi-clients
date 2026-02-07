namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemDetailHeldByPokemonInnerVersionDetailsInner

module PokemonDetailHeldItems =

  //#region PokemonDetailHeldItems

  [<CLIMutable>]
  type PokemonDetailHeldItems = {
    [<JsonProperty(PropertyName = "item")>]
    Item : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : ItemDetailHeldByPokemonInnerVersionDetailsInner[];
  }

  //#endregion
