namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaSummary
open OpenAPI.Model.string option

module PaginatedLocationAreaSummaryList =

  //#region PaginatedLocationAreaSummaryList


  type PaginatedLocationAreaSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : LocationAreaSummary[];
  }
  //#endregion
