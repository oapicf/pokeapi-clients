namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveStatChange

module StatAffectingMoves =

  //#region StatAffectingMoves

  [<CLIMutable>]
  type StatAffectingMoves = {
    [<JsonProperty(PropertyName = "increase")>]
    Increase : MoveStatChange[];
    [<JsonProperty(PropertyName = "decrease")>]
    Decrease : MoveStatChange[];
  }

  //#endregion
