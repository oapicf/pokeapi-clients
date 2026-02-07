namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module SuperContestEffectFlavorText =

  //#region SuperContestEffectFlavorText

  [<CLIMutable>]
  type SuperContestEffectFlavorText = {
    [<JsonProperty(PropertyName = "flavor_text")>]
    FlavorText : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
