namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaCategorySummary

module PaginatedMoveMetaCategorySummaryList =

  //#region PaginatedMoveMetaCategorySummaryList


  type PaginatedMoveMetaCategorySummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveMetaCategorySummary[];
  }
  //#endregion
