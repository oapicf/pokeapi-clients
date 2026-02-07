namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LanguageSummary

module PaginatedLanguageSummaryList =

  //#region PaginatedLanguageSummaryList


  type PaginatedLanguageSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : LanguageSummary[];
  }
  //#endregion
