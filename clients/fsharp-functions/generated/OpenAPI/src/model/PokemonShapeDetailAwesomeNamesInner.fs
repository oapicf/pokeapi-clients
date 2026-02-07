namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonShapeDetailAwesomeNamesInner =

  //#region PokemonShapeDetailAwesomeNamesInner

  [<CLIMutable>]
  type PokemonShapeDetailAwesomeNamesInner = {
    [<JsonProperty(PropertyName = "awesome_name")>]
    AwesomeName : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
