namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StatSummary

module PokemonStat =

  //#region PokemonStat


  type PokemonStat = {
    BaseStat : int;
    Effort : int;
    Stat : StatSummary;
  }
  //#endregion
