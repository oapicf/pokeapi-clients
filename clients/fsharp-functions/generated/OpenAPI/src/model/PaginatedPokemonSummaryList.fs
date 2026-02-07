namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonSummary

module PaginatedPokemonSummaryList =

  //#region PaginatedPokemonSummaryList

  [<CLIMutable>]
  type PaginatedPokemonSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonSummary[];
  }

  //#endregion
