namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveLearnMethodSummary

module PaginatedMoveLearnMethodSummaryList =

  //#region PaginatedMoveLearnMethodSummaryList


  type PaginatedMoveLearnMethodSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveLearnMethodSummary[];
  }
  //#endregion
