namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilitySummary

module PaginatedAbilitySummaryList =

  //#region PaginatedAbilitySummaryList


  type PaginatedAbilitySummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : AbilitySummary[];
  }
  //#endregion
