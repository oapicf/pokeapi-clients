namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StatSummary
open OpenAPI.Model.string option

module PaginatedStatSummaryList =

  //#region PaginatedStatSummaryList


  type PaginatedStatSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : StatSummary[];
  }
  //#endregion
