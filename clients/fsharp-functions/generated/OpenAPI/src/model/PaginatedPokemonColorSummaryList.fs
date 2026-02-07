namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonColorSummary

module PaginatedPokemonColorSummaryList =

  //#region PaginatedPokemonColorSummaryList

  [<CLIMutable>]
  type PaginatedPokemonColorSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonColorSummary[];
  }

  //#endregion
