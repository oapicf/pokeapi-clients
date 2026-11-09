namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CharacteristicSummary
open OpenAPI.Model.string option

module PaginatedCharacteristicSummaryList =

  //#region PaginatedCharacteristicSummaryList

  [<CLIMutable>]
  type PaginatedCharacteristicSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : CharacteristicSummary[];
  }

  //#endregion
