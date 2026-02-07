namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AbilitySummary =

  //#region AbilitySummary

  [<CLIMutable>]
  type AbilitySummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
