namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MachineSummary

module PaginatedMachineSummaryList =

  //#region PaginatedMachineSummaryList


  type PaginatedMachineSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : MachineSummary[];
  }
  //#endregion
