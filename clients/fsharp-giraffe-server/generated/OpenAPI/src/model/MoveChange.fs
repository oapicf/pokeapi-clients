namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveEffectEffectText
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module MoveChange =

  //#region MoveChange


  type MoveChange = {
    Accuracy : int option;
    Power : int option;
    Pp : int option;
    EffectChance : int option;
    EffectEntries : MoveEffectEffectText[];
    Type : TypeSummary;
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
