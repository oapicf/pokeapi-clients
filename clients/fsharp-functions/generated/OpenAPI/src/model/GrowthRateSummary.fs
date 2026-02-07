namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GrowthRateSummary =

  //#region GrowthRateSummary

  [<CLIMutable>]
  type GrowthRateSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
