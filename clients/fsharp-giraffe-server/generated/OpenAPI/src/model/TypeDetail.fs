namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityName
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.TypeDetailDamageRelations
open OpenAPI.Model.TypeDetailPastDamageRelationsInner
open OpenAPI.Model.TypeDetailPokemonInner
open OpenAPI.Model.TypeDetailSpritesValueValue
open OpenAPI.Model.TypeGameIndex
open System.Collections.Generic

module TypeDetail =

  //#region TypeDetail


  type TypeDetail = {
    Id : int;
    Name : string;
    DamageRelations : TypeDetailDamageRelations;
    PastDamageRelations : TypeDetailPastDamageRelationsInner[];
    GameIndices : TypeGameIndex[];
    Generation : GenerationSummary;
    MoveDamageClass : MoveDamageClassSummary;
    Names : AbilityName[];
    Pokemon : TypeDetailPokemonInner[];
    Moves : MoveSummary[];
    Sprites : IDictionary<string, IDictionary<string, TypeDetailSpritesValueValue>>;
  }
  //#endregion
