namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MoveBattleStyleSummary =

  //#region MoveBattleStyleSummary

  [<CLIMutable>]
  type MoveBattleStyleSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
