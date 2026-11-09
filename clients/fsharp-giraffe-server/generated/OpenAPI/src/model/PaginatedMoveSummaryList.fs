namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.string option

module PaginatedMoveSummaryList =

  //#region PaginatedMoveSummaryList


  type PaginatedMoveSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveSummary[];
  }
  //#endregion
