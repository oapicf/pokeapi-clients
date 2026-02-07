namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionSummary

module PokemonSpeciesFlavorText =

  //#region PokemonSpeciesFlavorText


  type PokemonSpeciesFlavorText = {
    FlavorText : string;
    Language : LanguageSummary;
    Version : VersionSummary;
  }
  //#endregion
