namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveEffectChangeEffectText
open OpenAPI.Model.VersionGroupSummary

module MoveEffectChange =

  //#region MoveEffectChange


  type MoveEffectChange = {
    VersionGroup : VersionGroupSummary;
    EffectEntries : MoveEffectChangeEffectText[];
  }
  //#endregion
