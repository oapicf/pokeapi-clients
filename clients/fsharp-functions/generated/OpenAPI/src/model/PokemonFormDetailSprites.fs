namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module PokemonFormDetailSprites =

  //#region PokemonFormDetailSprites

  [<CLIMutable>]
  type PokemonFormDetailSprites = {
    [<JsonProperty(PropertyName = "default")>]
    Default : string;
  }

  //#endregion
