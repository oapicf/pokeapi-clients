namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemDetailSprites =

  //#region ItemDetailSprites

  [<CLIMutable>]
  type ItemDetailSprites = {
    [<JsonProperty(PropertyName = "default")>]
    Default : string;
  }

  //#endregion
