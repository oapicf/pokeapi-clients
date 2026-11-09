namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemFlingEffectSummary
open OpenAPI.Model.string option

module PaginatedItemFlingEffectSummaryList =

  //#region PaginatedItemFlingEffectSummaryList


  type PaginatedItemFlingEffectSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ItemFlingEffectSummary[];
  }
  //#endregion
