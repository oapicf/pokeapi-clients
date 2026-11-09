namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterMethodSummary
open OpenAPI.Model.string option

module PaginatedEncounterMethodSummaryList =

  //#region PaginatedEncounterMethodSummaryList


  type PaginatedEncounterMethodSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : EncounterMethodSummary[];
  }
  //#endregion
