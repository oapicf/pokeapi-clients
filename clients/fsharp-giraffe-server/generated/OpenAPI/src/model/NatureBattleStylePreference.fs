namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveBattleStyleSummary

module NatureBattleStylePreference =

  //#region NatureBattleStylePreference


  type NatureBattleStylePreference = {
    LowHpPreference : int;
    HighHpPreference : int;
    MoveBattleStyle : MoveBattleStyleSummary;
  }
  //#endregion
