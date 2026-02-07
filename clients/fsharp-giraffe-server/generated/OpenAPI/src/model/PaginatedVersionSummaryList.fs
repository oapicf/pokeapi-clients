namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionSummary

module PaginatedVersionSummaryList =

  //#region PaginatedVersionSummaryList


  type PaginatedVersionSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : VersionSummary[];
  }
  //#endregion
