namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.string option
open System.Collections.Generic

module PokemonSpritesOtherOfficialArtwork =

  //#region PokemonSpritesOtherOfficialArtwork


  type PokemonSpritesOtherOfficialArtwork = {
    FrontDefault : string option;
    FrontShiny : string option;
    Versions : IDictionary<string, IDictionary<string, AnyType>>;
  }
  //#endregion
