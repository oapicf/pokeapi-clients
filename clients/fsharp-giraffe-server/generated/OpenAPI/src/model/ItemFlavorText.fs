namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionGroupSummary

module ItemFlavorText =

  //#region ItemFlavorText


  type ItemFlavorText = {
    Text : string;
    VersionGroup : VersionGroupSummary;
    Language : LanguageSummary;
  }
  //#endregion
