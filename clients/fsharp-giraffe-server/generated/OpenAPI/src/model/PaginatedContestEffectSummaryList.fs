namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContestEffectSummary
open OpenAPI.Model.string option

module PaginatedContestEffectSummaryList =

  //#region PaginatedContestEffectSummaryList


  type PaginatedContestEffectSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ContestEffectSummary[];
  }
  //#endregion
