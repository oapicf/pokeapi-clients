namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityChange
open OpenAPI.Model.AbilityDetailPokemonInner
open OpenAPI.Model.AbilityEffectText
open OpenAPI.Model.AbilityFlavorText
open OpenAPI.Model.AbilityName
open OpenAPI.Model.GenerationSummary

module AbilityDetail =

  //#region AbilityDetail


  type AbilityDetail = {
    Id : int;
    Name : string;
    IsMainSeries : bool;
    Generation : GenerationSummary;
    Names : AbilityName[];
    EffectEntries : AbilityEffectText[];
    EffectChanges : AbilityChange[];
    FlavorTextEntries : AbilityFlavorText[];
    Pokemon : AbilityDetailPokemonInner[];
  }
  //#endregion
