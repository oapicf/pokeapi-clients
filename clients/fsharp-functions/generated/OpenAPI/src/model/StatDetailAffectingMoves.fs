namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StatDetailAffectingMovesIncreaseInner

module StatDetailAffectingMoves =

  //#region StatDetailAffectingMoves

  [<CLIMutable>]
  type StatDetailAffectingMoves = {
    [<JsonProperty(PropertyName = "increase")>]
    Increase : StatDetailAffectingMovesIncreaseInner[];
    [<JsonProperty(PropertyName = "decrease")>]
    Decrease : StatDetailAffectingMovesIncreaseInner[];
  }

  //#endregion
