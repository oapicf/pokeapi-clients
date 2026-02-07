namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VersionGroupSummary =

  //#region VersionGroupSummary

  [<CLIMutable>]
  type VersionGroupSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
