namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SuperContestEffectSummary
open OpenAPI.Model.string option

module PaginatedSuperContestEffectSummaryList =

  //#region PaginatedSuperContestEffectSummaryList


  type PaginatedSuperContestEffectSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : SuperContestEffectSummary[];
  }
  //#endregion
