namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonFormDetailFormNamesInner =

  //#region PokemonFormDetailFormNamesInner

  [<CLIMutable>]
  type PokemonFormDetailFormNamesInner = {
    [<JsonProperty(PropertyName = "language")>]
    Language : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
