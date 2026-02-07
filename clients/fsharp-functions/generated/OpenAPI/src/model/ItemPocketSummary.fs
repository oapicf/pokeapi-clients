namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemPocketSummary =

  //#region ItemPocketSummary

  [<CLIMutable>]
  type ItemPocketSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
