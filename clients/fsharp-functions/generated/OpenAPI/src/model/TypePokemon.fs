namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSummary

module TypePokemon =

  //#region TypePokemon

  [<CLIMutable>]
  type TypePokemon = {
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : PokemonSummary;
  }

  //#endregion
