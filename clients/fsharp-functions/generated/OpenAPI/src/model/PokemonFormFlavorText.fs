namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionSummary

module PokemonFormFlavorText =

  //#region PokemonFormFlavorText

  [<CLIMutable>]
  type PokemonFormFlavorText = {
    [<JsonProperty(PropertyName = "flavor_text")>]
    FlavorText : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
  }

  //#endregion
