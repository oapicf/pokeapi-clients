namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.PokemonStat

module PokemonPastStat =

  //#region PokemonPastStat


  type PokemonPastStat = {
    Generation : GenerationSummary;
    Stats : PokemonStat[];
  }
  //#endregion
