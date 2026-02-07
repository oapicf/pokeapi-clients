namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributeSummary

module PaginatedItemAttributeSummaryList =

  //#region PaginatedItemAttributeSummaryList


  type PaginatedItemAttributeSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : ItemAttributeSummary[];
  }
  //#endregion
