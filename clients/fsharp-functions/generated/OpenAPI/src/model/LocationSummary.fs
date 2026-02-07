namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LocationSummary =

  //#region LocationSummary

  [<CLIMutable>]
  type LocationSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
