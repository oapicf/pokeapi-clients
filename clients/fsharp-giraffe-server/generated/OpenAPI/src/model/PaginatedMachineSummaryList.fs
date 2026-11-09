namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MachineSummary
open OpenAPI.Model.string option

module PaginatedMachineSummaryList =

  //#region PaginatedMachineSummaryList


  type PaginatedMachineSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : MachineSummary[];
  }
  //#endregion
