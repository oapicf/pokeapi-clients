namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionGroupSummary

module ItemFlavorText =

  //#region ItemFlavorText

  [<CLIMutable>]
  type ItemFlavorText = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
