namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module ItemDetailHeldByPokemonInnerVersionDetailsInner =

  //#region ItemDetailHeldByPokemonInnerVersionDetailsInner

  [<CLIMutable>]
  type ItemDetailHeldByPokemonInnerVersionDetailsInner = {
    [<JsonProperty(PropertyName = "rarity")>]
    Rarity : int;
    [<JsonProperty(PropertyName = "version")>]
    Version : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
