namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterMethodSummary
open OpenAPI.Model.string option

module PaginatedEncounterMethodSummaryList =

  //#region PaginatedEncounterMethodSummaryList

  [<CLIMutable>]
  type PaginatedEncounterMethodSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : EncounterMethodSummary[];
  }

  //#endregion
