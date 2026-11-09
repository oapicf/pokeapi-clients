namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.string option

module PaginatedGenerationSummaryList =

  //#region PaginatedGenerationSummaryList


  type PaginatedGenerationSummaryList = {
    Count : int;
    Next : string option;
    Previous : string option;
    Results : GenerationSummary[];
  }
  //#endregion
