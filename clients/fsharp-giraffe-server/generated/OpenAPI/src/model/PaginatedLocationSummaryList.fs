namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationSummary
open OpenAPI.Model.string option

module PaginatedLocationSummaryList =

  //#region PaginatedLocationSummaryList


  type PaginatedLocationSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : LocationSummary[];
  }
  //#endregion
