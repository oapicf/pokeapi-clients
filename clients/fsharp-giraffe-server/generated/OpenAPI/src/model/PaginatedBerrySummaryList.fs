namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerrySummary
open OpenAPI.Model.string option

module PaginatedBerrySummaryList =

  //#region PaginatedBerrySummaryList


  type PaginatedBerrySummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : BerrySummary[];
  }
  //#endregion
