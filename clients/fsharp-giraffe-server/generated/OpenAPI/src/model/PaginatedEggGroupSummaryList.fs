namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EggGroupSummary
open OpenAPI.Model.string option

module PaginatedEggGroupSummaryList =

  //#region PaginatedEggGroupSummaryList


  type PaginatedEggGroupSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EggGroupSummary[];
  }
  //#endregion
