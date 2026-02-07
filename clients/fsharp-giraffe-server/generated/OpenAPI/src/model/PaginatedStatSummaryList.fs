namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StatSummary

module PaginatedStatSummaryList =

  //#region PaginatedStatSummaryList


  type PaginatedStatSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : StatSummary[];
  }
  //#endregion
