namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemFlingEffectSummary

module PaginatedItemFlingEffectSummaryList =

  //#region PaginatedItemFlingEffectSummaryList


  type PaginatedItemFlingEffectSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ItemFlingEffectSummary[];
  }
  //#endregion
