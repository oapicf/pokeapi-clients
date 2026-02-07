namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemFlingEffectSummary =

  //#region ItemFlingEffectSummary

  [<CLIMutable>]
  type ItemFlingEffectSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
