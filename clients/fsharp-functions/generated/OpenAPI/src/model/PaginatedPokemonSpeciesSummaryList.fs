namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.string option

module PaginatedPokemonSpeciesSummaryList =

  //#region PaginatedPokemonSpeciesSummaryList

  [<CLIMutable>]
  type PaginatedPokemonSpeciesSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonSpeciesSummary[];
  }

  //#endregion
