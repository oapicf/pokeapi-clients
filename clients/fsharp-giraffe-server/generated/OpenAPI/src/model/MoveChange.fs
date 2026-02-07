namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveChangeEffectEntriesInner
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module MoveChange =

  //#region MoveChange


  type MoveChange = {
    Accuracy : int option;
    Power : int option;
    Pp : int option;
    EffectChance : int;
    EffectEntries : MoveChangeEffectEntriesInner[];
    Type : TypeSummary;
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
