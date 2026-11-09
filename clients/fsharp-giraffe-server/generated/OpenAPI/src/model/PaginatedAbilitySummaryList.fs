namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilitySummary
open OpenAPI.Model.string option

module PaginatedAbilitySummaryList =

  //#region PaginatedAbilitySummaryList


  type PaginatedAbilitySummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : AbilitySummary[];
  }
  //#endregion
