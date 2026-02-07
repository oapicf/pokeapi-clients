namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GrowthRateSummary

module PaginatedGrowthRateSummaryList =

  //#region PaginatedGrowthRateSummaryList


  type PaginatedGrowthRateSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : GrowthRateSummary[];
  }
  //#endregion
