namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MoveSummary =

  //#region MoveSummary

  [<CLIMutable>]
  type MoveSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
