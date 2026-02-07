namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveDetailEffectChangesInnerEffectEntriesInner

module MoveDetailEffectChangesInner =

  //#region MoveDetailEffectChangesInner

  [<CLIMutable>]
  type MoveDetailEffectChangesInner = {
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : MoveDetailEffectChangesInnerEffectEntriesInner[];
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
