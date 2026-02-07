namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ContestTypeSummary =

  //#region ContestTypeSummary

  [<CLIMutable>]
  type ContestTypeSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
