namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonSpeciesDetailPalParkEncountersInner =

  //#region PokemonSpeciesDetailPalParkEncountersInner

  [<CLIMutable>]
  type PokemonSpeciesDetailPalParkEncountersInner = {
    [<JsonProperty(PropertyName = "area")>]
    Area : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "base_score")>]
    BaseScore : int;
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
  }

  //#endregion
