namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.string option

module PaginatedGenerationSummaryList =

  //#region PaginatedGenerationSummaryList

  [<CLIMutable>]
  type PaginatedGenerationSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : GenerationSummary[];
  }

  //#endregion
