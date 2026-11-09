namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.TypeRelationships

module TypePastRelationships =

  //#region TypePastRelationships

  [<CLIMutable>]
  type TypePastRelationships = {
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "damage_relations")>]
    DamageRelations : TypeRelationships;
  }

  //#endregion
