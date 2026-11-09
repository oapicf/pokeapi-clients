namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NatureSummary
open OpenAPI.Model.string option

module PaginatedNatureSummaryList =

  //#region PaginatedNatureSummaryList


  type PaginatedNatureSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : NatureSummary[];
  }
  //#endregion
