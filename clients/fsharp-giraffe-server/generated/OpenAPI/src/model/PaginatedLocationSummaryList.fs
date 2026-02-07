namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationSummary

module PaginatedLocationSummaryList =

  //#region PaginatedLocationSummaryList


  type PaginatedLocationSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : LocationSummary[];
  }
  //#endregion
