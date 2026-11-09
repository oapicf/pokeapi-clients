namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSummary

module AbilityPokemonDetail =

  //#region AbilityPokemonDetail

  [<CLIMutable>]
  type AbilityPokemonDetail = {
    [<JsonProperty(PropertyName = "is_hidden")>]
    IsHidden : bool;
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : PokemonSummary;
  }

  //#endregion
