namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveBattleStyleSummary

module NatureBattleStylePreference =

  //#region NatureBattleStylePreference

  [<CLIMutable>]
  type NatureBattleStylePreference = {
    [<JsonProperty(PropertyName = "low_hp_preference")>]
    LowHpPreference : int;
    [<JsonProperty(PropertyName = "high_hp_preference")>]
    HighHpPreference : int;
    [<JsonProperty(PropertyName = "move_battle_style")>]
    MoveBattleStyle : MoveBattleStyleSummary;
  }

  //#endregion
