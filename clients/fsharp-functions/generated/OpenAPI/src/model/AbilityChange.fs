namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityChangeEffectText
open OpenAPI.Model.VersionGroupSummary

module AbilityChange =

  //#region AbilityChange

  [<CLIMutable>]
  type AbilityChange = {
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : AbilityChangeEffectText[];
  }

  //#endregion
