namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaSummary

module PaginatedLocationAreaSummaryList =

  //#region PaginatedLocationAreaSummaryList


  type PaginatedLocationAreaSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : LocationAreaSummary[];
  }
  //#endregion
