namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveComboUsage

module MoveCombos =

  //#region MoveCombos

  [<CLIMutable>]
  type MoveCombos = {
    [<JsonProperty(PropertyName = "normal")>]
    Normal : MoveComboUsage;
    [<JsonProperty(PropertyName = "super")>]
    Super : MoveComboUsage;
  }

  //#endregion
