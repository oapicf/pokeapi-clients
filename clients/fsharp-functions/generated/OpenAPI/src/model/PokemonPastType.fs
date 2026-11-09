namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.PokemonType

module PokemonPastType =

  //#region PokemonPastType

  [<CLIMutable>]
  type PokemonPastType = {
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "types")>]
    Types : PokemonType[];
  }

  //#endregion
