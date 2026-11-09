namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module PokemonShapeAwesomeName =

  //#region PokemonShapeAwesomeName

  [<CLIMutable>]
  type PokemonShapeAwesomeName = {
    [<JsonProperty(PropertyName = "awesome_name")>]
    AwesomeName : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
