namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ContestEffectSummary
open OpenAPI.Model.ContestTypeSummary
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.MoveChange
open OpenAPI.Model.MoveChangeEffectEntriesInner
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.MoveDetailContestCombos
open OpenAPI.Model.MoveDetailEffectChangesInner
open OpenAPI.Model.MoveDetailMachinesInner
open OpenAPI.Model.MoveDetailStatChangesInner
open OpenAPI.Model.MoveFlavorText
open OpenAPI.Model.MoveMeta
open OpenAPI.Model.MoveName
open OpenAPI.Model.MoveTargetSummary
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
    EffectChance : int;
    [<JsonProperty(PropertyName = "pp")>]
    Pp : int option;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : int option;
    [<JsonProperty(PropertyName = "power")>]
    Power : int option;
    [<JsonProperty(PropertyName = "contest_combos")>]
    ContestCombos : MoveDetailContestCombos;
    [<JsonProperty(PropertyName = "contest_type")>]
    ContestType : ContestTypeSummary;
    [<JsonProperty(PropertyName = "contest_effect")>]
    ContestEffect : ContestEffectSummary;
    [<JsonProperty(PropertyName = "damage_class")>]
    DamageClass : MoveDamageClassSummary;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : MoveChangeEffectEntriesInner[];
    [<JsonProperty(PropertyName = "effect_changes")>]
    EffectChanges : MoveDetailEffectChangesInner[];
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "meta")>]
    Meta : MoveMeta;
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveName[];
    [<JsonProperty(PropertyName = "past_values")>]
    PastValues : MoveChange[];
    [<JsonProperty(PropertyName = "stat_changes")>]
    StatChanges : MoveDetailStatChangesInner[];
    [<JsonProperty(PropertyName = "super_contest_effect")>]
    SuperContestEffect : SuperContestEffectSummary;
    [<JsonProperty(PropertyName = "target")>]
    Target : MoveTargetSummary;
    [<JsonProperty(PropertyName = "type")>]
    Type : TypeSummary;
    [<JsonProperty(PropertyName = "machines")>]
    Machines : MoveDetailMachinesInner[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : MoveFlavorText[];
    [<JsonProperty(PropertyName = "learned_by_pokemon")>]
    LearnedByPokemon : AbilityDetailPokemonInnerPokemon[];
  }

  //#endregion
