namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContestTypeSummary

module PaginatedContestTypeSummaryList =

  //#region PaginatedContestTypeSummaryList


  type PaginatedContestTypeSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ContestTypeSummary[];
  }
  //#endregion
