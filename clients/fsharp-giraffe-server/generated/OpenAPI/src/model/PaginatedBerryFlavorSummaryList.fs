namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorSummary

module PaginatedBerryFlavorSummaryList =

  //#region PaginatedBerryFlavorSummaryList


  type PaginatedBerryFlavorSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : BerryFlavorSummary[];
  }
  //#endregion
