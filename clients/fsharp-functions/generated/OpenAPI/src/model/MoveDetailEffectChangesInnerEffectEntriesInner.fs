namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module MoveDetailEffectChangesInnerEffectEntriesInner =

  //#region MoveDetailEffectChangesInnerEffectEntriesInner

  [<CLIMutable>]
  type MoveDetailEffectChangesInnerEffectEntriesInner = {
    [<JsonProperty(PropertyName = "effect")>]
    Effect : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
