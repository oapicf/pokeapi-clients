namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module PokemonSpeciesGenus =

  //#region PokemonSpeciesGenus

  [<CLIMutable>]
  type PokemonSpeciesGenus = {
    [<JsonProperty(PropertyName = "genus")>]
    Genus : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
