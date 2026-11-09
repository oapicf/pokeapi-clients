namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.PokemonStat

module PokemonPastStat =

  //#region PokemonPastStat

  [<CLIMutable>]
  type PokemonPastStat = {
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "stats")>]
    Stats : PokemonStat[];
  }

  //#endregion
