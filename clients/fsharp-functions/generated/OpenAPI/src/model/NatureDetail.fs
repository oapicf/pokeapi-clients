namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.BerrySummary
open OpenAPI.Model.NatureBattleStylePreference
open OpenAPI.Model.NatureDetailPokeathlonStatChangesInner
open OpenAPI.Model.NatureName
open OpenAPI.Model.StatSummary

module NatureDetail =

  //#region NatureDetail

  [<CLIMutable>]
  type NatureDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "decreased_stat")>]
    DecreasedStat : StatSummary;
    [<JsonProperty(PropertyName = "increased_stat")>]
    IncreasedStat : StatSummary;
    [<JsonProperty(PropertyName = "likes_flavor")>]
    LikesFlavor : BerryFlavorSummary;
    [<JsonProperty(PropertyName = "hates_flavor")>]
    HatesFlavor : BerryFlavorSummary;
    [<JsonProperty(PropertyName = "berries")>]
    Berries : BerrySummary[];
    [<JsonProperty(PropertyName = "pokeathlon_stat_changes")>]
    PokeathlonStatChanges : NatureDetailPokeathlonStatChangesInner[];
    [<JsonProperty(PropertyName = "move_battle_style_preferences")>]
    MoveBattleStylePreferences : NatureBattleStylePreference[];
    [<JsonProperty(PropertyName = "names")>]
    Names : NatureName[];
  }

  //#endregion
