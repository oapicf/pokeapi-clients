namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module CharacteristicDescription =

  //#region CharacteristicDescription

  [<CLIMutable>]
  type CharacteristicDescription = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
