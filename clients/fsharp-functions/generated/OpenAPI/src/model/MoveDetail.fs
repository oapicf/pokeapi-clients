namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContestEffectSummary
open OpenAPI.Model.ContestTypeSummary
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.ItemMachine
open OpenAPI.Model.MoveChange
open OpenAPI.Model.MoveCombos
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.MoveEffectChange
open OpenAPI.Model.MoveEffectEffectText
open OpenAPI.Model.MoveFlavorText
open OpenAPI.Model.MoveMeta
open OpenAPI.Model.MoveMetaStatChange
open OpenAPI.Model.MoveName
open OpenAPI.Model.MoveTargetSummary
open OpenAPI.Model.PokemonSummary
open OpenAPI.Model.SuperContestEffectSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.int option

module MoveDetail =

  //#region MoveDetail

  [<CLIMutable>]
  type MoveDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "accuracy")>]
    Accuracy : int option;
    [<JsonProperty(PropertyName = "effect_chance")>]
    EffectChance : int option;
    [<JsonProperty(PropertyName = "pp")>]
    Pp : int option;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : int option;
    [<JsonProperty(PropertyName = "power")>]
    Power : int option;
    [<JsonProperty(PropertyName = "contest_combos")>]
    ContestCombos : MoveCombos;
    [<JsonProperty(PropertyName = "contest_type")>]
    ContestType : ContestTypeSummary;
    [<JsonProperty(PropertyName = "contest_effect")>]
    ContestEffect : ContestEffectSummary;
    [<JsonProperty(PropertyName = "damage_class")>]
    DamageClass : MoveDamageClassSummary;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : MoveEffectEffectText[];
    [<JsonProperty(PropertyName = "effect_changes")>]
    EffectChanges : MoveEffectChange[];
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "meta")>]
    Meta : MoveMeta;
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveName[];
    [<JsonProperty(PropertyName = "past_values")>]
    PastValues : MoveChange[];
    [<JsonProperty(PropertyName = "stat_changes")>]
    StatChanges : MoveMetaStatChange[];
    [<JsonProperty(PropertyName = "super_contest_effect")>]
    SuperContestEffect : SuperContestEffectSummary;
    [<JsonProperty(PropertyName = "target")>]
    Target : MoveTargetSummary;
    [<JsonProperty(PropertyName = "type")>]
    Type : TypeSummary;
    [<JsonProperty(PropertyName = "machines")>]
    Machines : ItemMachine[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : MoveFlavorText[];
    [<JsonProperty(PropertyName = "learned_by_pokemon")>]
    LearnedByPokemon : PokemonSummary[];
  }

  //#endregion
