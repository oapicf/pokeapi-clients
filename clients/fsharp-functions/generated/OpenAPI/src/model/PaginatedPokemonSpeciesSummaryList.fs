namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSpeciesSummary

module PaginatedPokemonSpeciesSummaryList =

  //#region PaginatedPokemonSpeciesSummaryList

  [<CLIMutable>]
  type PaginatedPokemonSpeciesSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonSpeciesSummary[];
  }

  //#endregion
