namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NatureSummary

module PaginatedNatureSummaryList =

  //#region PaginatedNatureSummaryList


  type PaginatedNatureSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : NatureSummary[];
  }
  //#endregion
