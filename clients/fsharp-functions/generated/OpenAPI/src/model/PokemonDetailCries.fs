namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonDetailCries =

  //#region PokemonDetailCries

  [<CLIMutable>]
  type PokemonDetailCries = {
    [<JsonProperty(PropertyName = "latest")>]
    Latest : string;
    [<JsonProperty(PropertyName = "legacy")>]
    Legacy : string;
  }

  //#endregion
