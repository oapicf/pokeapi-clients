namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.string option

module PaginatedMoveDamageClassSummaryList =

  //#region PaginatedMoveDamageClassSummaryList


  type PaginatedMoveDamageClassSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MoveDamageClassSummary[];
  }
  //#endregion
