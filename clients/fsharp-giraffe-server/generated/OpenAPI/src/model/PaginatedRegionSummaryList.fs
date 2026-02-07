namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RegionSummary

module PaginatedRegionSummaryList =

  //#region PaginatedRegionSummaryList


  type PaginatedRegionSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : RegionSummary[];
  }
  //#endregion
