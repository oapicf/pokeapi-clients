namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary

module MoveStatChange =

  //#region MoveStatChange

  [<CLIMutable>]
  type MoveStatChange = {
    [<JsonProperty(PropertyName = "change")>]
    Change : int;
    [<JsonProperty(PropertyName = "move")>]
    Move : MoveSummary;
  }

  //#endregion
