namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module ItemFlingEffectEffectText =

  //#region ItemFlingEffectEffectText

  [<CLIMutable>]
  type ItemFlingEffectEffectText = {
    [<JsonProperty(PropertyName = "effect")>]
    Effect : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
