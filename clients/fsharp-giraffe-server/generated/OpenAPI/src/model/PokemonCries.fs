namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module PokemonCries =

  //#region PokemonCries


  type PokemonCries = {
    Latest : string option;
    Legacy : string option;
  }
  //#endregion
