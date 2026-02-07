namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary

module PaginatedGenerationSummaryList =

  //#region PaginatedGenerationSummaryList


  type PaginatedGenerationSummaryList = {
    Count : int;
    Next : string;
    Previous : string;
    Results : GenerationSummary[];
  }
  //#endregion
