namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributeSummary
open OpenAPI.Model.string option

module PaginatedItemAttributeSummaryList =

  //#region PaginatedItemAttributeSummaryList


  type PaginatedItemAttributeSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : ItemAttributeSummary[];
  }
  //#endregion
