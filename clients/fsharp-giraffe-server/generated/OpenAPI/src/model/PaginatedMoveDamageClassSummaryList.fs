namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveDamageClassSummary

module PaginatedMoveDamageClassSummaryList =

  //#region PaginatedMoveDamageClassSummaryList


  type PaginatedMoveDamageClassSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MoveDamageClassSummary[];
  }
  //#endregion
