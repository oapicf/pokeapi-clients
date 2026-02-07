namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionGroupSummary

module PaginatedVersionGroupSummaryList =

  //#region PaginatedVersionGroupSummaryList


  type PaginatedVersionGroupSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : VersionGroupSummary[];
  }
  //#endregion
