namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module PokemonCries =

  //#region PokemonCries

  [<CLIMutable>]
  type PokemonCries = {
    [<JsonProperty(PropertyName = "latest")>]
    Latest : string option;
    [<JsonProperty(PropertyName = "legacy")>]
    Legacy : string option;
  }

  //#endregion
