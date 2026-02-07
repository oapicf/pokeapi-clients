namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CharacteristicSummary

module PaginatedCharacteristicSummaryList =

  //#region PaginatedCharacteristicSummaryList


  type PaginatedCharacteristicSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : CharacteristicSummary[];
  }
  //#endregion
