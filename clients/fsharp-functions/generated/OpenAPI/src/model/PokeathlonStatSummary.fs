namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokeathlonStatSummary =

  //#region PokeathlonStatSummary

  [<CLIMutable>]
  type PokeathlonStatSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
