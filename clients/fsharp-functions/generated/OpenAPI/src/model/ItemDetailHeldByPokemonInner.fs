namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemDetailHeldByPokemonInnerVersionDetailsInner

module ItemDetailHeldByPokemonInner =

  //#region ItemDetailHeldByPokemonInner

  [<CLIMutable>]
  type ItemDetailHeldByPokemonInner = {
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "version-details")>]
    VersionDetails : ItemDetailHeldByPokemonInnerVersionDetailsInner[];
  }

  //#endregion
