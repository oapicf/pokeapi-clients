namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityChangeEffectText
open OpenAPI.Model.VersionGroupSummary

module AbilityChange =

  //#region AbilityChange


  type AbilityChange = {
    VersionGroup : VersionGroupSummary;
    EffectEntries : AbilityChangeEffectText[];
  }
  //#endregion
