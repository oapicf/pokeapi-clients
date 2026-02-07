namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module PokedexDescription =

  //#region PokedexDescription

  [<CLIMutable>]
  type PokedexDescription = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
