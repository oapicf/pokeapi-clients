namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterMethodSummary

module PaginatedEncounterMethodSummaryList =

  //#region PaginatedEncounterMethodSummaryList

  [<CLIMutable>]
  type PaginatedEncounterMethodSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : EncounterMethodSummary[];
  }

  //#endregion
