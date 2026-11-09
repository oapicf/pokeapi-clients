namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveLearnMethodSummary
open OpenAPI.Model.string option

module PaginatedMoveLearnMethodSummaryList =

  //#region PaginatedMoveLearnMethodSummaryList


  type PaginatedMoveLearnMethodSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveLearnMethodSummary[];
  }
  //#endregion
