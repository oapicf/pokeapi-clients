namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokemonDetailTypesInner

module PokemonDetailPastTypesInner =

  //#region PokemonDetailPastTypesInner

  [<CLIMutable>]
  type PokemonDetailPastTypesInner = {
    [<JsonProperty(PropertyName = "generation")>]
    Generation : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "types")>]
    Types : PokemonDetailTypesInner[];
  }

  //#endregion
