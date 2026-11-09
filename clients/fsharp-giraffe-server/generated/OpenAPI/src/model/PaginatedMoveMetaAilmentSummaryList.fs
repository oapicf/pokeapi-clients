namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaAilmentSummary
open OpenAPI.Model.string option

module PaginatedMoveMetaAilmentSummaryList =

  //#region PaginatedMoveMetaAilmentSummaryList


  type PaginatedMoveMetaAilmentSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveMetaAilmentSummary[];
  }
  //#endregion
