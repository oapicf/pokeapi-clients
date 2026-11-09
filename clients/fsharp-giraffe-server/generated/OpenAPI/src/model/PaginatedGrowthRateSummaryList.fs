namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GrowthRateSummary
open OpenAPI.Model.string option

module PaginatedGrowthRateSummaryList =

  //#region PaginatedGrowthRateSummaryList


  type PaginatedGrowthRateSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : GrowthRateSummary[];
  }
  //#endregion
