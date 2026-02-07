namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveMetaAilmentSummary
open OpenAPI.Model.MoveMetaCategorySummary
open OpenAPI.Model.int option

module MoveMeta =

  //#region MoveMeta

  [<CLIMutable>]
  type MoveMeta = {
    [<JsonProperty(PropertyName = "ailment")>]
    Ailment : MoveMetaAilmentSummary;
    [<JsonProperty(PropertyName = "category")>]
    Category : MoveMetaCategorySummary;
    [<JsonProperty(PropertyName = "min_hits")>]
    MinHits : int option;
    [<JsonProperty(PropertyName = "max_hits")>]
    MaxHits : int option;
    [<JsonProperty(PropertyName = "min_turns")>]
    MinTurns : int option;
    [<JsonProperty(PropertyName = "max_turns")>]
    MaxTurns : int option;
    [<JsonProperty(PropertyName = "drain")>]
    Drain : int option;
    [<JsonProperty(PropertyName = "healing")>]
    Healing : int option;
    [<JsonProperty(PropertyName = "crit_rate")>]
    CritRate : int option;
    [<JsonProperty(PropertyName = "ailment_chance")>]
    AilmentChance : int option;
    [<JsonProperty(PropertyName = "flinch_chance")>]
    FlinchChance : int option;
    [<JsonProperty(PropertyName = "stat_chance")>]
    StatChance : int option;
  }

  //#endregion
