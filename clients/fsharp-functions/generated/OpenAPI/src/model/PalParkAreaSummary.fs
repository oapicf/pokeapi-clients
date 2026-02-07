namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PalParkAreaSummary =

  //#region PalParkAreaSummary

  [<CLIMutable>]
  type PalParkAreaSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
