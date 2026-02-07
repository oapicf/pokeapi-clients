namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary

module ItemGameIndex =

  //#region ItemGameIndex

  [<CLIMutable>]
  type ItemGameIndex = {
    [<JsonProperty(PropertyName = "game_index")>]
    GameIndex : int;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
  }

  //#endregion
