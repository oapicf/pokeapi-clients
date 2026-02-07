namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokedexSummary =

  //#region PokedexSummary

  [<CLIMutable>]
  type PokedexSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
