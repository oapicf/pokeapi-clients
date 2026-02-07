namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaAilmentSummary
open OpenAPI.Model.MoveMetaCategorySummary
open OpenAPI.Model.int option

module MoveMeta =

  //#region MoveMeta


  type MoveMeta = {
    Ailment : MoveMetaAilmentSummary;
    Category : MoveMetaCategorySummary;
    MinHits : int option;
    MaxHits : int option;
    MinTurns : int option;
    MaxTurns : int option;
    Drain : int option;
    Healing : int option;
    CritRate : int option;
    AilmentChance : int option;
    FlinchChance : int option;
    StatChance : int option;
  }
  //#endregion
