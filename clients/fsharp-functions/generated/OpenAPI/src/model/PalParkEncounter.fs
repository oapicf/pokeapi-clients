namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.int option

module PalParkEncounter =

  //#region PalParkEncounter

  [<CLIMutable>]
  type PalParkEncounter = {
    [<JsonProperty(PropertyName = "base_score")>]
    BaseScore : int option;
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary;
  }

  //#endregion
