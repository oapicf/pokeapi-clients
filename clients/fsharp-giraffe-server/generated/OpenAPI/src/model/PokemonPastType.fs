namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.PokemonType

module PokemonPastType =

  //#region PokemonPastType


  type PokemonPastType = {
    Generation : GenerationSummary;
    Types : PokemonType[];
  }
  //#endregion
