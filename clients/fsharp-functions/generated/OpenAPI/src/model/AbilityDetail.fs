namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityChange
open OpenAPI.Model.AbilityDetailPokemonInner
open OpenAPI.Model.AbilityEffectText
open OpenAPI.Model.AbilityFlavorText
open OpenAPI.Model.AbilityName
open OpenAPI.Model.GenerationSummary

module AbilityDetail =

  //#region AbilityDetail

  [<CLIMutable>]
  type AbilityDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "is_main_series")>]
    IsMainSeries : bool;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : AbilityName[];
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : AbilityEffectText[];
    [<JsonProperty(PropertyName = "effect_changes")>]
    EffectChanges : AbilityChange[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : AbilityFlavorText[];
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : AbilityDetailPokemonInner[];
  }

  //#endregion
