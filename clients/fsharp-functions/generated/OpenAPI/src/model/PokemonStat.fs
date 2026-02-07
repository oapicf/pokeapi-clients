namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.StatSummary

module PokemonStat =

  //#region PokemonStat

  [<CLIMutable>]
  type PokemonStat = {
    [<JsonProperty(PropertyName = "base_stat")>]
    BaseStat : int;
    [<JsonProperty(PropertyName = "effort")>]
    Effort : int;
    [<JsonProperty(PropertyName = "stat")>]
    Stat : StatSummary;
  }

  //#endregion
