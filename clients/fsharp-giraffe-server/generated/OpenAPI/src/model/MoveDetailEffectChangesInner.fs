namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveDetailEffectChangesInnerEffectEntriesInner

module MoveDetailEffectChangesInner =

  //#region MoveDetailEffectChangesInner


  type MoveDetail_effect_changes_inner = {
    EffectEntries : MoveDetailEffectChangesInnerEffectEntriesInner[];
    VersionGroup : AbilityDetailPokemonInnerPokemon;
  }
  //#endregion
