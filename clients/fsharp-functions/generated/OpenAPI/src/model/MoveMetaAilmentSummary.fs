namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MoveMetaAilmentSummary =

  //#region MoveMetaAilmentSummary

  [<CLIMutable>]
  type MoveMetaAilmentSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
