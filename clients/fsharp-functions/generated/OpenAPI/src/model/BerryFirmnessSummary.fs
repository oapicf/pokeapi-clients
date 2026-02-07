namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BerryFirmnessSummary =

  //#region BerryFirmnessSummary

  [<CLIMutable>]
  type BerryFirmnessSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
