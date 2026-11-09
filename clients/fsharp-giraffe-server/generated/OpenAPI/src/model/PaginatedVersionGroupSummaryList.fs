namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.string option

module PaginatedVersionGroupSummaryList =

  //#region PaginatedVersionGroupSummaryList


  type PaginatedVersionGroupSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : VersionGroupSummary[];
  }
  //#endregion
