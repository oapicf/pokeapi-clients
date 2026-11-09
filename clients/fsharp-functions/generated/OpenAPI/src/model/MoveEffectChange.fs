namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveEffectChangeEffectText
open OpenAPI.Model.VersionGroupSummary

module MoveEffectChange =

  //#region MoveEffectChange

  [<CLIMutable>]
  type MoveEffectChange = {
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : MoveEffectChangeEffectText[];
  }

  //#endregion
