namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFirmnessSummary

module PaginatedBerryFirmnessSummaryList =

  //#region PaginatedBerryFirmnessSummaryList


  type PaginatedBerryFirmnessSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : BerryFirmnessSummary[];
  }
  //#endregion
