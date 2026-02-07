namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonSpeciesDetailGeneraInner =

  //#region PokemonSpeciesDetailGeneraInner

  [<CLIMutable>]
  type PokemonSpeciesDetailGeneraInner = {
    [<JsonProperty(PropertyName = "genus")>]
    Genus : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
