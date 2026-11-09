namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.string option

module PaginatedRegionSummaryList =

  //#region PaginatedRegionSummaryList


  type PaginatedRegionSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : RegionSummary[];
  }
  //#endregion
