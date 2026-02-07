namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EggGroupSummary =

  //#region EggGroupSummary

  [<CLIMutable>]
  type EggGroupSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
