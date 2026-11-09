namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSummary

module PokemonSpeciesVariety =

  //#region PokemonSpeciesVariety

  [<CLIMutable>]
  type PokemonSpeciesVariety = {
    [<JsonProperty(PropertyName = "is_default")>]
    IsDefault : bool;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : PokemonSummary;
  }

  //#endregion
