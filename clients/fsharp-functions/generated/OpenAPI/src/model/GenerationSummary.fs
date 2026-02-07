namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerationSummary =

  //#region GenerationSummary

  [<CLIMutable>]
  type GenerationSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
