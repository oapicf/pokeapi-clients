namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveDetailContestCombosNormal

module MoveDetailContestCombos =

  //#region MoveDetailContestCombos

  [<CLIMutable>]
  type MoveDetailContestCombos = {
    [<JsonProperty(PropertyName = "normal")>]
    Normal : MoveDetailContestCombosNormal;
    [<JsonProperty(PropertyName = "super")>]
    Super : MoveDetailContestCombosNormal;
  }

  //#endregion
