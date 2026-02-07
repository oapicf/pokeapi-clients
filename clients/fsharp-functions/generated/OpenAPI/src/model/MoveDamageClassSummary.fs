namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MoveDamageClassSummary =

  //#region MoveDamageClassSummary

  [<CLIMutable>]
  type MoveDamageClassSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
