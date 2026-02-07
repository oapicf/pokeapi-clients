namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContestEffectSummary

module PaginatedContestEffectSummaryList =

  //#region PaginatedContestEffectSummaryList


  type PaginatedContestEffectSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ContestEffectSummary[];
  }
  //#endregion
