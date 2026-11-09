namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CharacteristicSummary
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.StatAffectingMoves
open OpenAPI.Model.StatAffectingNatures
open OpenAPI.Model.StatName

module StatDetail =

  //#region StatDetail

  [<CLIMutable>]
  type StatDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "game_index")>]
    GameIndex : int;
    [<JsonProperty(PropertyName = "is_battle_only")>]
    IsBattleOnly : bool;
    [<JsonProperty(PropertyName = "affecting_moves")>]
    AffectingMoves : StatAffectingMoves;
    [<JsonProperty(PropertyName = "affecting_natures")>]
    AffectingNatures : StatAffectingNatures;
    [<JsonProperty(PropertyName = "affecting_items")>]
    AffectingItems : ItemSummary[];
    [<JsonProperty(PropertyName = "characteristics")>]
    Characteristics : CharacteristicSummary[];
    [<JsonProperty(PropertyName = "move_damage_class")>]
    MoveDamageClass : MoveDamageClassSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : StatName[];
  }

  //#endregion
