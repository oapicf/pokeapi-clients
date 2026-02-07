namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module PokemonDetailSprites =

  //#region PokemonDetailSprites

  [<CLIMutable>]
  type PokemonDetailSprites = {
    [<JsonProperty(PropertyName = "front_default")>]
    FrontDefault : string;
  }

  //#endregion
