namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaCategorySummary
open OpenAPI.Model.string option

module PaginatedMoveMetaCategorySummaryList =

  //#region PaginatedMoveMetaCategorySummaryList


  type PaginatedMoveMetaCategorySummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveMetaCategorySummary[];
  }
  //#endregion
