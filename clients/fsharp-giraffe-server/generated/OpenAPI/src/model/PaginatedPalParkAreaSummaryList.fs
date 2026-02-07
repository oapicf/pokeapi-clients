namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PalParkAreaSummary

module PaginatedPalParkAreaSummaryList =

  //#region PaginatedPalParkAreaSummaryList


  type PaginatedPalParkAreaSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : PalParkAreaSummary[];
  }
  //#endregion
