namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary

module TypeGameIndex =

  //#region TypeGameIndex

  [<CLIMutable>]
  type TypeGameIndex = {
    [<JsonProperty(PropertyName = "game_index")>]
    GameIndex : int;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
  }

  //#endregion
