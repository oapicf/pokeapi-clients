namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonSummary =

  //#region PokemonSummary

  [<CLIMutable>]
  type PokemonSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
