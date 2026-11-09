namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemCategorySummary
open OpenAPI.Model.string option

module PaginatedItemCategorySummaryList =

  //#region PaginatedItemCategorySummaryList


  type PaginatedItemCategorySummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ItemCategorySummary[];
  }
  //#endregion
