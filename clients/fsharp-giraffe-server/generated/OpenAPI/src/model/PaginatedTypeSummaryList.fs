namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.string option

module PaginatedTypeSummaryList =

  //#region PaginatedTypeSummaryList


  type PaginatedTypeSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : TypeSummary[];
  }
  //#endregion
