namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenderSummary =

  //#region GenderSummary

  [<CLIMutable>]
  type GenderSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
