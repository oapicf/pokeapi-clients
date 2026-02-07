namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemPocketSummary

module PaginatedItemPocketSummaryList =

  //#region PaginatedItemPocketSummaryList


  type PaginatedItemPocketSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ItemPocketSummary[];
  }
  //#endregion
