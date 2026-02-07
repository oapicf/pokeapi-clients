namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenderSummary

module PaginatedGenderSummaryList =

  //#region PaginatedGenderSummaryList


  type PaginatedGenderSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : GenderSummary[];
  }
  //#endregion
