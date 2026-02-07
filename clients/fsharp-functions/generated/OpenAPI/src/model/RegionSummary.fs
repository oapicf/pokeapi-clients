namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RegionSummary =

  //#region RegionSummary

  [<CLIMutable>]
  type RegionSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
