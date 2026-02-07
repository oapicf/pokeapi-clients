namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LocationAreaSummary =

  //#region LocationAreaSummary

  [<CLIMutable>]
  type LocationAreaSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
