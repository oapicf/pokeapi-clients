namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type MoveDetail = {
    Id : int;
    Name : string;
    Accuracy : int option;
    EffectChance : int;
    Pp : int option;
    Priority : int option;
    Power : int option;
    ContestCombos : MoveDetailContestCombos;
    ContestType : ContestTypeSummary;
    ContestEffect : ContestEffectSummary;
    DamageClass : MoveDamageClassSummary;
    EffectEntries : MoveChangeEffectEntriesInner[];
    EffectChanges : MoveDetailEffectChangesInner[];
    Generation : GenerationSummary;
    Meta : MoveMeta;
    Names : MoveName[];
    PastValues : MoveChange[];
    StatChanges : MoveDetailStatChangesInner[];
    SuperContestEffect : SuperContestEffectSummary;
    Target : MoveTargetSummary;
    Type : TypeSummary;
    Machines : MoveDetailMachinesInner[];
    FlavorTextEntries : MoveFlavorText[];
    LearnedByPokemon : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
