namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.TypeGameIndex
open OpenAPI.Model.TypeGameSprite
open OpenAPI.Model.TypeName
open OpenAPI.Model.TypePastRelationships
open OpenAPI.Model.TypePokemon
open OpenAPI.Model.TypeRelationships
open System.Collections.Generic

module TypeDetail =

  //#region TypeDetail


  type TypeDetail = {
    Id : int;
    Name : string;
    DamageRelations : TypeRelationships;
    PastDamageRelations : TypePastRelationships[];
    GameIndices : TypeGameIndex[];
    Generation : GenerationSummary;
    MoveDamageClass : MoveDamageClassSummary;
    Names : TypeName[];
    Pokemon : TypePokemon[];
    Moves : MoveSummary[];
    Sprites : IDictionary<string, IDictionary<string, TypeGameSprite>>;
  }
  //#endregion
