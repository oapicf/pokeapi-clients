namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PalParkAreaDetailPokemonEncountersInner =

  //#region PalParkAreaDetailPokemonEncountersInner

  [<CLIMutable>]
  type PalParkAreaDetailPokemonEncountersInner = {
    [<JsonProperty(PropertyName = "base_score")>]
    BaseScore : int;
    [<JsonProperty(PropertyName = "pokemon-species")>]
    PokemonSpecies : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
  }

  //#endregion
