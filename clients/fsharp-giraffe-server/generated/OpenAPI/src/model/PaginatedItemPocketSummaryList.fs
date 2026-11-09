namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemPocketSummary
open OpenAPI.Model.string option

module PaginatedItemPocketSummaryList =

  //#region PaginatedItemPocketSummaryList


  type PaginatedItemPocketSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ItemPocketSummary[];
  }
  //#endregion
