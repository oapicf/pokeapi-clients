namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionSummary

module PokemonFormFlavorText =

  //#region PokemonFormFlavorText


  type PokemonFormFlavorText = {
    FlavorText : string;
    Language : LanguageSummary;
    Version : VersionSummary;
  }
  //#endregion
