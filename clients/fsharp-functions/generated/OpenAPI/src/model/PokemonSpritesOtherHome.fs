namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module PokemonSpritesOtherHome =

  //#region PokemonSpritesOtherHome

  [<CLIMutable>]
  type PokemonSpritesOtherHome = {
    [<JsonProperty(PropertyName = "front_default")>]
    FrontDefault : string option;
    [<JsonProperty(PropertyName = "front_female")>]
    FrontFemale : string option;
    [<JsonProperty(PropertyName = "front_shiny")>]
    FrontShiny : string option;
    [<JsonProperty(PropertyName = "front_shiny_female")>]
    FrontShinyFemale : string option;
  }

  //#endregion
