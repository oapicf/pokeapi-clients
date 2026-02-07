namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CharacteristicSummary =

  //#region CharacteristicSummary

  [<CLIMutable>]
  type CharacteristicSummary = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
