namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TypeSummary

module TypeRelationships =

  //#region TypeRelationships

  [<CLIMutable>]
  type TypeRelationships = {
    [<JsonProperty(PropertyName = "no_damage_to")>]
    NoDamageTo : TypeSummary[];
    [<JsonProperty(PropertyName = "half_damage_to")>]
    HalfDamageTo : TypeSummary[];
    [<JsonProperty(PropertyName = "double_damage_to")>]
    DoubleDamageTo : TypeSummary[];
    [<JsonProperty(PropertyName = "no_damage_from")>]
    NoDamageFrom : TypeSummary[];
    [<JsonProperty(PropertyName = "half_damage_from")>]
    HalfDamageFrom : TypeSummary[];
    [<JsonProperty(PropertyName = "double_damage_from")>]
    DoubleDamageFrom : TypeSummary[];
  }

  //#endregion
