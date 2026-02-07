namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MoveLearnMethodSummary =

  //#region MoveLearnMethodSummary

  [<CLIMutable>]
  type MoveLearnMethodSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
