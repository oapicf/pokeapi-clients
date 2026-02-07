namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CharacteristicSummary

module PaginatedCharacteristicSummaryList =

  //#region PaginatedCharacteristicSummaryList

  [<CLIMutable>]
  type PaginatedCharacteristicSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : CharacteristicSummary[];
  }

  //#endregion
