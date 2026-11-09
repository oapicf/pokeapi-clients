namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSummary
open OpenAPI.Model.string option

module PaginatedPokemonSummaryList =

  //#region PaginatedPokemonSummaryList

  [<CLIMutable>]
  type PaginatedPokemonSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonSummary[];
  }

  //#endregion
