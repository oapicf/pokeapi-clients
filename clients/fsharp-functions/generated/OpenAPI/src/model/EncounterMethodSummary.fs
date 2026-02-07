namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EncounterMethodSummary =

  //#region EncounterMethodSummary

  [<CLIMutable>]
  type EncounterMethodSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
