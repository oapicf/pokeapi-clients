namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module PokemonSpeciesDescription =

  //#region PokemonSpeciesDescription

  [<CLIMutable>]
  type PokemonSpeciesDescription = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
