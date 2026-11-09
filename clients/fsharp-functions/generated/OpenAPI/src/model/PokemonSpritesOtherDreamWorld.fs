namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module PokemonSpritesOtherDreamWorld =

  //#region PokemonSpritesOtherDreamWorld

  [<CLIMutable>]
  type PokemonSpritesOtherDreamWorld = {
    [<JsonProperty(PropertyName = "front_default")>]
    FrontDefault : string option;
    [<JsonProperty(PropertyName = "front_female")>]
    FrontFemale : string option;
  }

  //#endregion
