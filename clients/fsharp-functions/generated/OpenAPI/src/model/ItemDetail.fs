namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemCategorySummary
open OpenAPI.Model.ItemDetailBabyTriggerFor
open OpenAPI.Model.ItemDetailHeldByPokemonInner
open OpenAPI.Model.ItemDetailMachinesInner
open OpenAPI.Model.ItemDetailSprites
open OpenAPI.Model.ItemEffectText
open OpenAPI.Model.ItemFlavorText
open OpenAPI.Model.ItemFlingEffectSummary
open OpenAPI.Model.ItemGameIndex
open OpenAPI.Model.ItemName
open OpenAPI.Model.int option

module ItemDetail =

  //#region ItemDetail

  [<CLIMutable>]
  type ItemDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "cost")>]
    Cost : int option;
    [<JsonProperty(PropertyName = "fling_power")>]
    FlingPower : int option;
    [<JsonProperty(PropertyName = "fling_effect")>]
    FlingEffect : ItemFlingEffectSummary;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "category")>]
    Category : ItemCategorySummary;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : ItemEffectText[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : ItemFlavorText[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : ItemGameIndex[];
    [<JsonProperty(PropertyName = "names")>]
    Names : ItemName[];
    [<JsonProperty(PropertyName = "held_by_pokemon")>]
    HeldByPokemon : ItemDetailHeldByPokemonInner[];
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : ItemDetailSprites;
    [<JsonProperty(PropertyName = "baby_trigger_for")>]
    BabyTriggerFor : ItemDetailBabyTriggerFor;
    [<JsonProperty(PropertyName = "machines")>]
    Machines : ItemDetailMachinesInner[];
  }

  //#endregion
