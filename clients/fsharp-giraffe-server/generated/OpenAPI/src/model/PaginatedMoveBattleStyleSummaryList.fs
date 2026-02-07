namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveBattleStyleSummary

module PaginatedMoveBattleStyleSummaryList =

  //#region PaginatedMoveBattleStyleSummaryList


  type PaginatedMoveBattleStyleSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveBattleStyleSummary[];
  }
  //#endregion
