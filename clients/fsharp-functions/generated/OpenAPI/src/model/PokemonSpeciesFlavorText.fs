namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionSummary

module PokemonSpeciesFlavorText =

  //#region PokemonSpeciesFlavorText

  [<CLIMutable>]
  type PokemonSpeciesFlavorText = {
    [<JsonProperty(PropertyName = "flavor_text")>]
    FlavorText : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
  }

  //#endregion
