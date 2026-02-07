namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionGroupSummary

module AbilityFlavorText =

  //#region AbilityFlavorText

  [<CLIMutable>]
  type AbilityFlavorText = {
    [<JsonProperty(PropertyName = "flavor_text")>]
    FlavorText : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
  }

  //#endregion
