namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterMethodSummary

module PaginatedEncounterMethodSummaryList =

  //#region PaginatedEncounterMethodSummaryList


  type PaginatedEncounterMethodSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : EncounterMethodSummary[];
  }
  //#endregion
