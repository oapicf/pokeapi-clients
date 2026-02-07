namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerrySummary

module PaginatedBerrySummaryList =

  //#region PaginatedBerrySummaryList


  type PaginatedBerrySummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : BerrySummary[];
  }
  //#endregion
