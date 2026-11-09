namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.PokemonSpritesOther
open OpenAPI.Model.string option
open System.Collections.Generic

module PokemonSprites =

  //#region PokemonSprites

  [<CLIMutable>]
  type PokemonSprites = {
    [<JsonProperty(PropertyName = "front_default")>]
    FrontDefault : string option;
    [<JsonProperty(PropertyName = "front_shiny")>]
    FrontShiny : string option;
    [<JsonProperty(PropertyName = "front_female")>]
    FrontFemale : string option;
    [<JsonProperty(PropertyName = "front_shiny_female")>]
    FrontShinyFemale : string option;
    [<JsonProperty(PropertyName = "back_default")>]
    BackDefault : string option;
    [<JsonProperty(PropertyName = "back_shiny")>]
    BackShiny : string option;
    [<JsonProperty(PropertyName = "back_female")>]
    BackFemale : string option;
    [<JsonProperty(PropertyName = "back_shiny_female")>]
    BackShinyFemale : string option;
    [<JsonProperty(PropertyName = "other")>]
    Other : PokemonSpritesOther;
    [<JsonProperty(PropertyName = "versions")>]
    Versions : IDictionary<string, IDictionary<string, AnyType>>;
  }

  //#endregion
