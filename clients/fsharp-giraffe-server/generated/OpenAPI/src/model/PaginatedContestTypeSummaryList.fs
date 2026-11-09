namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContestTypeSummary
open OpenAPI.Model.string option

module PaginatedContestTypeSummaryList =

  //#region PaginatedContestTypeSummaryList


  type PaginatedContestTypeSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ContestTypeSummary[];
  }
  //#endregion
