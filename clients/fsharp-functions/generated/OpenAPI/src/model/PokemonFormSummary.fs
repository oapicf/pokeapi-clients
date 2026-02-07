namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonFormSummary =

  //#region PokemonFormSummary

  [<CLIMutable>]
  type PokemonFormSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
