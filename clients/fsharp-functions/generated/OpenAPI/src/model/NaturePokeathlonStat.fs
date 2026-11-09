namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokeathlonStatSummary

module NaturePokeathlonStat =

  //#region NaturePokeathlonStat

  [<CLIMutable>]
  type NaturePokeathlonStat = {
    [<JsonProperty(PropertyName = "max_change")>]
    MaxChange : int;
    [<JsonProperty(PropertyName = "pokeathlon_stat")>]
    PokeathlonStat : PokeathlonStatSummary;
  }

  //#endregion
