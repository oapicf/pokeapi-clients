namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveTargetSummary

module PaginatedMoveTargetSummaryList =

  //#region PaginatedMoveTargetSummaryList


  type PaginatedMoveTargetSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveTargetSummary[];
  }
  //#endregion
