namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EggGroupSummary

module PaginatedEggGroupSummaryList =

  //#region PaginatedEggGroupSummaryList


  type PaginatedEggGroupSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : EggGroupSummary[];
  }
  //#endregion
