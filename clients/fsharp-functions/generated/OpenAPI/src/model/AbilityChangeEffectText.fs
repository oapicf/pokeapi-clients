namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module AbilityChangeEffectText =

  //#region AbilityChangeEffectText

  [<CLIMutable>]
  type AbilityChangeEffectText = {
    [<JsonProperty(PropertyName = "effect")>]
    Effect : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
