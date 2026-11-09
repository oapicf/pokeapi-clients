namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type TypeDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "damage_relations")>]
    DamageRelations : TypeRelationships;
    [<JsonProperty(PropertyName = "past_damage_relations")>]
    PastDamageRelations : TypePastRelationships[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : TypeGameIndex[];
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "move_damage_class")>]
    MoveDamageClass : MoveDamageClassSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : TypeName[];
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : TypePokemon[];
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : IDictionary<string, IDictionary<string, TypeGameSprite>>;
  }

  //#endregion
