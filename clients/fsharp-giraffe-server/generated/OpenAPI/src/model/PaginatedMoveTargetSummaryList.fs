namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveTargetSummary
open OpenAPI.Model.string option

module PaginatedMoveTargetSummaryList =

  //#region PaginatedMoveTargetSummaryList


  type PaginatedMoveTargetSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveTargetSummary[];
  }
  //#endregion
