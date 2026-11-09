namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type ItemDetail = {
    Id : int;
    Name : string;
    FlingPower : int option;
    FlingEffect : ItemFlingEffectSummary;
    Attributes : ItemAttributeSummary[];
    Category : ItemCategorySummary;
    EffectEntries : ItemEffectText[];
    FlavorTextEntries : ItemFlavorText[];
    GameIndices : ItemGameIndex[];
    Prices : ItemPrice[];
    Names : ItemName[];
    HeldByPokemon : PokemonHeldItem[];
    Sprites : ItemSprites;
    BabyTriggerFor : EvolutionChainSummary;
    Machines : ItemMachine[];
  }
  //#endregion
