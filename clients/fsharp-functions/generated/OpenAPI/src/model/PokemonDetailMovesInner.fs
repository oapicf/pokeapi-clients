namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokemonDetailMovesInnerVersionGroupDetailsInner

module PokemonDetailMovesInner =

  //#region PokemonDetailMovesInner

  [<CLIMutable>]
  type PokemonDetailMovesInner = {
    [<JsonProperty(PropertyName = "move")>]
    Move : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "version_group_details")>]
    VersionGroupDetails : PokemonDetailMovesInnerVersionGroupDetailsInner[];
  }

  //#endregion
