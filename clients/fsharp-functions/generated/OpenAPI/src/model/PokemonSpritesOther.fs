namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSpritesOtherDreamWorld
open OpenAPI.Model.PokemonSpritesOtherHome
open OpenAPI.Model.PokemonSpritesOtherOfficialArtwork
open OpenAPI.Model.PokemonSpritesOtherShowdown

module PokemonSpritesOther =

  //#region PokemonSpritesOther

  [<CLIMutable>]
  type PokemonSpritesOther = {
    [<JsonProperty(PropertyName = "dream_world")>]
    DreamWorld : PokemonSpritesOtherDreamWorld;
    [<JsonProperty(PropertyName = "home")>]
    Home : PokemonSpritesOtherHome;
    [<JsonProperty(PropertyName = "showdown")>]
    Showdown : PokemonSpritesOtherShowdown;
    [<JsonProperty(PropertyName = "official-artwork")>]
    OfficialArtwork : PokemonSpritesOtherOfficialArtwork;
  }

  //#endregion
