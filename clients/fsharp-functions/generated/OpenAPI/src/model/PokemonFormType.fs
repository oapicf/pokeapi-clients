namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TypeSummary

module PokemonFormType =

  //#region PokemonFormType

  [<CLIMutable>]
  type PokemonFormType = {
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : TypeSummary;
  }

  //#endregion
