namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StatSummary

module MoveMetaStatChange =

  //#region MoveMetaStatChange

  [<CLIMutable>]
  type MoveMetaStatChange = {
    [<JsonProperty(PropertyName = "change")>]
    Change : int;
    [<JsonProperty(PropertyName = "stat")>]
    Stat : StatSummary;
  }

  //#endregion
