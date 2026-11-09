namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSpeciesSummary

module GenderPokemonSpecies =

  //#region GenderPokemonSpecies

  [<CLIMutable>]
  type GenderPokemonSpecies = {
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary;
  }

  //#endregion
