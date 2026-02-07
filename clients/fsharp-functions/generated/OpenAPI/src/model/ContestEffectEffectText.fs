namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module ContestEffectEffectText =

  //#region ContestEffectEffectText

  [<CLIMutable>]
  type ContestEffectEffectText = {
    [<JsonProperty(PropertyName = "effect")>]
    Effect : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
