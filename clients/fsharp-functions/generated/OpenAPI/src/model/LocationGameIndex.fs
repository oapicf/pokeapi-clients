namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary

module LocationGameIndex =

  //#region LocationGameIndex

  [<CLIMutable>]
  type LocationGameIndex = {
    [<JsonProperty(PropertyName = "game_index")>]
    GameIndex : int;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
  }

  //#endregion
