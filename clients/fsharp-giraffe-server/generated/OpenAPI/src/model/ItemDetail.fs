namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type ItemDetail = {
    Id : int;
    Name : string;
    Cost : int option;
    FlingPower : int option;
    FlingEffect : ItemFlingEffectSummary;
    Attributes : AbilityDetailPokemonInnerPokemon[];
    Category : ItemCategorySummary;
    EffectEntries : ItemEffectText[];
    FlavorTextEntries : ItemFlavorText[];
    GameIndices : ItemGameIndex[];
    Names : ItemName[];
    HeldByPokemon : ItemDetailHeldByPokemonInner[];
    Sprites : ItemDetailSprites;
    BabyTriggerFor : ItemDetailBabyTriggerFor;
    Machines : ItemDetailMachinesInner[];
  }
  //#endregion
