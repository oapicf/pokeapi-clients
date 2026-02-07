namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonSpeciesDetailVarietiesInner =

  //#region PokemonSpeciesDetailVarietiesInner

  [<CLIMutable>]
  type PokemonSpeciesDetailVarietiesInner = {
    [<JsonProperty(PropertyName = "is_default")>]
    IsDefault : bool;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
