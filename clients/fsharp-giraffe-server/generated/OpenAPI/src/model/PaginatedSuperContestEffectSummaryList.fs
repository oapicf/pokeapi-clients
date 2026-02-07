namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SuperContestEffectSummary

module PaginatedSuperContestEffectSummaryList =

  //#region PaginatedSuperContestEffectSummaryList


  type PaginatedSuperContestEffectSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : SuperContestEffectSummary[];
  }
  //#endregion
