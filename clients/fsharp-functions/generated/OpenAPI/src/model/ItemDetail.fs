namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionChainSummary
open OpenAPI.Model.ItemAttributeSummary
open OpenAPI.Model.ItemCategorySummary
open OpenAPI.Model.ItemEffectText
open OpenAPI.Model.ItemFlavorText
open OpenAPI.Model.ItemFlingEffectSummary
open OpenAPI.Model.ItemGameIndex
open OpenAPI.Model.ItemMachine
open OpenAPI.Model.ItemName
open OpenAPI.Model.ItemPrice
open OpenAPI.Model.ItemSprites
open OpenAPI.Model.PokemonHeldItem
open OpenAPI.Model.int option

module ItemDetail =

  //#region ItemDetail

  [<CLIMutable>]
  type ItemDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "fling_power")>]
    FlingPower : int option;
    [<JsonProperty(PropertyName = "fling_effect")>]
    FlingEffect : ItemFlingEffectSummary;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributeSummary[];
    [<JsonProperty(PropertyName = "category")>]
    Category : ItemCategorySummary;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : ItemEffectText[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : ItemFlavorText[];
    [<JsonProperty(PropertyName = "game_indices")>]
    GameIndices : ItemGameIndex[];
    [<JsonProperty(PropertyName = "prices")>]
    Prices : ItemPrice[];
    [<JsonProperty(PropertyName = "names")>]
    Names : ItemName[];
    [<JsonProperty(PropertyName = "held_by_pokemon")>]
    HeldByPokemon : PokemonHeldItem[];
    [<JsonProperty(PropertyName = "sprites")>]
    Sprites : ItemSprites;
    [<JsonProperty(PropertyName = "baby_trigger_for")>]
    BabyTriggerFor : EvolutionChainSummary;
    [<JsonProperty(PropertyName = "machines")>]
    Machines : ItemMachine[];
  }

  //#endregion
