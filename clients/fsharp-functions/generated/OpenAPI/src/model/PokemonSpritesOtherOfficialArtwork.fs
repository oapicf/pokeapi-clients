namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.string option
open System.Collections.Generic

module PokemonSpritesOtherOfficialArtwork =

  //#region PokemonSpritesOtherOfficialArtwork

  [<CLIMutable>]
  type PokemonSpritesOtherOfficialArtwork = {
    [<JsonProperty(PropertyName = "front_default")>]
    FrontDefault : string option;
    [<JsonProperty(PropertyName = "front_shiny")>]
    FrontShiny : string option;
    [<JsonProperty(PropertyName = "versions")>]
    Versions : IDictionary<string, IDictionary<string, AnyType>>;
  }

  //#endregion
