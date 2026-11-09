namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.string option

module PaginatedBerryFlavorSummaryList =

  //#region PaginatedBerryFlavorSummaryList


  type PaginatedBerryFlavorSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : BerryFlavorSummary[];
  }
  //#endregion
