namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonFormSummary
open OpenAPI.Model.string option

module PaginatedPokemonFormSummaryList =

  //#region PaginatedPokemonFormSummaryList

  [<CLIMutable>]
  type PaginatedPokemonFormSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string option;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string option;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonFormSummary[];
  }

  //#endregion
