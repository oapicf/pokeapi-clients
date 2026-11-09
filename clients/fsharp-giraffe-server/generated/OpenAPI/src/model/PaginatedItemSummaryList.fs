namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.string option

module PaginatedItemSummaryList =

  //#region PaginatedItemSummaryList


  type PaginatedItemSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ItemSummary[];
  }
  //#endregion
