namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary

module PaginatedMoveSummaryList =

  //#region PaginatedMoveSummaryList


  type PaginatedMoveSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveSummary[];
  }
  //#endregion
