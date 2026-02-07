namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemCategorySummary

module PaginatedItemCategorySummaryList =

  //#region PaginatedItemCategorySummaryList


  type PaginatedItemCategorySummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ItemCategorySummary[];
  }
  //#endregion
