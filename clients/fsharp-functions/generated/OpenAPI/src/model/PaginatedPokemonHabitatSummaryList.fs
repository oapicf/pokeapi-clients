namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonHabitatSummary

module PaginatedPokemonHabitatSummaryList =

  //#region PaginatedPokemonHabitatSummaryList

  [<CLIMutable>]
  type PaginatedPokemonHabitatSummaryList = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "next")>]
    Next : string;
    [<JsonProperty(PropertyName = "previous")>]
    Previous : string;
    [<JsonProperty(PropertyName = "results")>]
    Results : PokemonHabitatSummary[];
  }

  //#endregion
