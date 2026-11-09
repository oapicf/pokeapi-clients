namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilitySummary

module PokemonAbility =

  //#region PokemonAbility

  [<CLIMutable>]
  type PokemonAbility = {
    [<JsonProperty(PropertyName = "is_hidden")>]
    IsHidden : bool;
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "ability")>]
    Ability : AbilitySummary;
  }

  //#endregion
