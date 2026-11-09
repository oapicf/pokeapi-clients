namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveBattleStyleSummary
open OpenAPI.Model.string option

module PaginatedMoveBattleStyleSummaryList =

  //#region PaginatedMoveBattleStyleSummaryList


  type PaginatedMoveBattleStyleSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveBattleStyleSummary[];
  }
  //#endregion
