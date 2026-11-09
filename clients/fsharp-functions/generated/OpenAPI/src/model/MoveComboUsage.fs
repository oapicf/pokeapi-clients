namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary

module MoveComboUsage =

  //#region MoveComboUsage

  [<CLIMutable>]
  type MoveComboUsage = {
    [<JsonProperty(PropertyName = "use_before")>]
    UseBefore : MoveSummary[];
    [<JsonProperty(PropertyName = "use_after")>]
    UseAfter : MoveSummary[];
  }

  //#endregion
