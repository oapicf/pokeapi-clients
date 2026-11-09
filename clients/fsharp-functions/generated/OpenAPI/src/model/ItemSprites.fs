namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module ItemSprites =

  //#region ItemSprites

  [<CLIMutable>]
  type ItemSprites = {
    [<JsonProperty(PropertyName = "default")>]
    Default : string option;
  }

  //#endregion
