namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type TypeDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "damage_relations")>]
    DamageRelations : TypeDetailDamageRelations;
    [<JsonProperty(PropertyName = "past_damage_relations")>]
    PastDamageRelations : TypeDetailPastDamageRelationsInner[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : TypeGameIndex[];
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "move_damage_class")>]
    MoveDamageClass : MoveDamageClassSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : AbilityName[];
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : TypeDetailPokemonInner[];
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : IDictionary<string, IDictionary<string, TypeDetailSpritesValueValue>>;
  }

  //#endregion
