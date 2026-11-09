namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.TypeRelationships

module TypePastRelationships =

  //#region TypePastRelationships


  type TypePastRelationships = {
    Generation : GenerationSummary;
    DamageRelations : TypeRelationships;
  }
  //#endregion
