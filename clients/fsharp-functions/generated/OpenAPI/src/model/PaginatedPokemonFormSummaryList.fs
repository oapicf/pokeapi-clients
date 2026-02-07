namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonFormSummary

module PaginatedPokemonFormSummaryList =

  //#region PaginatedPokemonFormSummaryList

  [<CLIMutable>]
  type PaginatedPokemonFormSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonFormSummary[];
  }

  //#endregion
