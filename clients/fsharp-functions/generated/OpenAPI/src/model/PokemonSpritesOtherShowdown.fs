namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module PokemonSpritesOtherShowdown =

  //#region PokemonSpritesOtherShowdown

  [<CLIMutable>]
  type PokemonSpritesOtherShowdown = {
    [<JsonProperty(PropertyName = "front_default")>]
    FrontDefault : string option;
    [<JsonProperty(PropertyName = "front_female")>]
    FrontFemale : string option;
    [<JsonProperty(PropertyName = "front_shiny")>]
    FrontShiny : string option;
    [<JsonProperty(PropertyName = "front_shiny_female")>]
    FrontShinyFemale : string option;
    [<JsonProperty(PropertyName = "back_default")>]
    BackDefault : string option;
    [<JsonProperty(PropertyName = "back_female")>]
    BackFemale : string option;
    [<JsonProperty(PropertyName = "back_shiny")>]
    BackShiny : string option;
    [<JsonProperty(PropertyName = "back_shiny_female")>]
    BackShinyFemale : string option;
  }

  //#endregion
