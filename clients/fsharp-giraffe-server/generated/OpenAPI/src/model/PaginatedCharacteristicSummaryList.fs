namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CharacteristicSummary
open OpenAPI.Model.string option

module PaginatedCharacteristicSummaryList =

  //#region PaginatedCharacteristicSummaryList


  type PaginatedCharacteristicSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : CharacteristicSummary[];
  }
  //#endregion
