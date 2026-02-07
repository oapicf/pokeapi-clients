namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module StatSummary =

  //#region StatSummary

  [<CLIMutable>]
  type StatSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
