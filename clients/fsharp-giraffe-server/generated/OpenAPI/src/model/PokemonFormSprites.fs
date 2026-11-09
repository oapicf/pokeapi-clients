namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.PokemonSpritesOther
open OpenAPI.Model.string option
open System.Collections.Generic

module PokemonFormSprites =

  //#region PokemonFormSprites


  type PokemonFormSprites = {
    FrontDefault : string option;
    FrontShiny : string option;
    FrontFemale : string option;
    FrontShinyFemale : string option;
    BackDefault : string option;
    BackShiny : string option;
    BackFemale : string option;
    BackShinyFemale : string option;
    Other : PokemonSpritesOther;
    Versions : IDictionary<string, IDictionary<string, AnyType>>;
  }
  //#endregion
