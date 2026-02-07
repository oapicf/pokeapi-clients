namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonShapeDetailNamesInner =

  //#region PokemonShapeDetailNamesInner

  [<CLIMutable>]
  type PokemonShapeDetailNamesInner = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
