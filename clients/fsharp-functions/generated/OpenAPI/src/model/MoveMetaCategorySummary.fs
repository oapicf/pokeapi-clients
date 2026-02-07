namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MoveMetaCategorySummary =

  //#region MoveMetaCategorySummary

  [<CLIMutable>]
  type MoveMetaCategorySummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
