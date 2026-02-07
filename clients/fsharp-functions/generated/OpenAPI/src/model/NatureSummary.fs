namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NatureSummary =

  //#region NatureSummary

  [<CLIMutable>]
  type NatureSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
