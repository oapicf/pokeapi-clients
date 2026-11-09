namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type MoveDetail = {
    Id : int;
    Name : string;
    Accuracy : int option;
    EffectChance : int option;
    Pp : int option;
    Priority : int option;
    Power : int option;
    ContestCombos : MoveCombos;
    ContestType : ContestTypeSummary;
    ContestEffect : ContestEffectSummary;
    DamageClass : MoveDamageClassSummary;
    EffectEntries : MoveEffectEffectText[];
    EffectChanges : MoveEffectChange[];
    Generation : GenerationSummary;
    Meta : MoveMeta;
    Names : MoveName[];
    PastValues : MoveChange[];
    StatChanges : MoveMetaStatChange[];
    SuperContestEffect : SuperContestEffectSummary;
    Target : MoveTargetSummary;
    Type : TypeSummary;
    Machines : ItemMachine[];
    FlavorTextEntries : MoveFlavorText[];
    LearnedByPokemon : PokemonSummary[];
  }
  //#endregion
