namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonColorSummary
open OpenAPI.Model.string option

module PaginatedPokemonColorSummaryList =

  //#region PaginatedPokemonColorSummaryList

  [<CLIMutable>]
  type PaginatedPokemonColorSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonColorSummary[];
  }

  //#endregion
