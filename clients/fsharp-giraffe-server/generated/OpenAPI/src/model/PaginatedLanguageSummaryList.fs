namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary
open OpenAPI.Model.string option

module PaginatedLanguageSummaryList =

  //#region PaginatedLanguageSummaryList


  type PaginatedLanguageSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : LanguageSummary[];
  }
  //#endregion
