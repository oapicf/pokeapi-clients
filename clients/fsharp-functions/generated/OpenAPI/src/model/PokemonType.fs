namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TypeSummary

module PokemonType =

  //#region PokemonType

  [<CLIMutable>]
  type PokemonType = {
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : TypeSummary;
  }

  //#endregion
