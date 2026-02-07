namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module ContestEffectFlavorText =

  //#region ContestEffectFlavorText

  [<CLIMutable>]
  type ContestEffectFlavorText = {
    [<JsonProperty(PropertyName = "flavor_text")>]
    FlavorText : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
