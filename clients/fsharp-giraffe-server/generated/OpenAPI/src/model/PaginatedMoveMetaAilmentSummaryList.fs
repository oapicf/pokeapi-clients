namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaAilmentSummary

module PaginatedMoveMetaAilmentSummaryList =

  //#region PaginatedMoveMetaAilmentSummaryList


  type PaginatedMoveMetaAilmentSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveMetaAilmentSummary[];
  }
  //#endregion
