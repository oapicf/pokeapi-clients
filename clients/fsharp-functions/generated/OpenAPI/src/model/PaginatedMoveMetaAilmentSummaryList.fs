namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveMetaAilmentSummary

module PaginatedMoveMetaAilmentSummaryList =

  //#region PaginatedMoveMetaAilmentSummaryList

  [<CLIMutable>]
  type PaginatedMoveMetaAilmentSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : MoveMetaAilmentSummary[];
  }

  //#endregion
