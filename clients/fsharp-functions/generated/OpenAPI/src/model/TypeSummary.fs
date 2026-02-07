namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TypeSummary =

  //#region TypeSummary

  [<CLIMutable>]
  type TypeSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
