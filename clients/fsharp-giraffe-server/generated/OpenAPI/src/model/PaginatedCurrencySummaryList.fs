namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CurrencySummary
open OpenAPI.Model.string option

module PaginatedCurrencySummaryList =

  //#region PaginatedCurrencySummaryList


  type PaginatedCurrencySummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : CurrencySummary[];
  }
  //#endregion
