namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenderSummary
open OpenAPI.Model.string option

module PaginatedGenderSummaryList =

  //#region PaginatedGenderSummaryList


  type PaginatedGenderSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : GenderSummary[];
  }
  //#endregion
