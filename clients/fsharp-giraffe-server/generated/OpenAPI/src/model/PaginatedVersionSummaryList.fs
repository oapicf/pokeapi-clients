namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionSummary
open OpenAPI.Model.string option

module PaginatedVersionSummaryList =

  //#region PaginatedVersionSummaryList


  type PaginatedVersionSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : VersionSummary[];
  }
  //#endregion
