namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSpritesOtherDreamWorld
open OpenAPI.Model.PokemonSpritesOtherHome
open OpenAPI.Model.PokemonSpritesOtherOfficialArtwork
open OpenAPI.Model.PokemonSpritesOtherShowdown

module PokemonSpritesOther =

  //#region PokemonSpritesOther


  type PokemonSpritesOther = {
    DreamWorld : PokemonSpritesOtherDreamWorld;
    Home : PokemonSpritesOtherHome;
    Showdown : PokemonSpritesOtherShowdown;
    OfficialArtwork : PokemonSpritesOtherOfficialArtwork;
  }
  //#endregion
