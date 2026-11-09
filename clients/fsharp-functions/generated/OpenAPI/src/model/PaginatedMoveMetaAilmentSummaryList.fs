namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveMetaAilmentSummary
open OpenAPI.Model.string option

module PaginatedMoveMetaAilmentSummaryList =

  //#region PaginatedMoveMetaAilmentSummaryList

  [<CLIMutable>]
  type PaginatedMoveMetaAilmentSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveMetaAilmentSummary[];
  }

  //#endregion
