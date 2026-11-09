namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PalParkAreaSummary
open OpenAPI.Model.string option

module PaginatedPalParkAreaSummaryList =

  //#region PaginatedPalParkAreaSummaryList


  type PaginatedPalParkAreaSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : PalParkAreaSummary[];
  }
  //#endregion
