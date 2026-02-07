namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemSummary

module PaginatedItemSummaryList =

  //#region PaginatedItemSummaryList


  type PaginatedItemSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ItemSummary[];
  }
  //#endregion
