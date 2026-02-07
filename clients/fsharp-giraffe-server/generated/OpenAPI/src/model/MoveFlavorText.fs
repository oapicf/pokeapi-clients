namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.VersionGroupSummary

module MoveFlavorText =

  //#region MoveFlavorText


  type MoveFlavorText = {
    FlavorText : string;
    Language : LanguageSummary;
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
