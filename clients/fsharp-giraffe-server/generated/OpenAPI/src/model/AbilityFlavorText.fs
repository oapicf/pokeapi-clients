namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionGroupSummary

module AbilityFlavorText =

  //#region AbilityFlavorText


  type AbilityFlavorText = {
    FlavorText : string;
    Language : LanguageSummary;
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
