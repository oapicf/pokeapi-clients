namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveChangeEffectEntriesInner
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module MoveChange =

  //#region MoveChange

  [<CLIMutable>]
  type MoveChange = {
    [<JsonProperty(PropertyName = "accuracy")>]
    Accuracy : int option;
    [<JsonProperty(PropertyName = "power")>]
    Power : int option;
    [<JsonProperty(PropertyName = "pp")>]
    Pp : int option;
    [<JsonProperty(PropertyName = "effect_chance")>]
    EffectChance : int;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : MoveChangeEffectEntriesInner[];
    [<JsonProperty(PropertyName = "type")>]
    Type : TypeSummary;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
  }

  //#endregion
