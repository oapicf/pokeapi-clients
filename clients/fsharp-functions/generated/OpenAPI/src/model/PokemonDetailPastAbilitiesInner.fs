namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.PokemonDetailAbilitiesInner

module PokemonDetailPastAbilitiesInner =

  //#region PokemonDetailPastAbilitiesInner

  [<CLIMutable>]
  type PokemonDetailPastAbilitiesInner = {
    [<JsonProperty(PropertyName = "abilities")>]
    Abilities : PokemonDetailAbilitiesInner[];
    [<JsonProperty(PropertyName = "generation")>]
    Generation : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
