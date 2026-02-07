namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TypeSummary

module PaginatedTypeSummaryList =

  //#region PaginatedTypeSummaryList


  type PaginatedTypeSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : TypeSummary[];
  }
  //#endregion
