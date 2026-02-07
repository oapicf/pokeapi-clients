namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionChainDetailChain
open OpenAPI.Model.ItemSummary

module EvolutionChainDetail =

  //#region EvolutionChainDetail


  type EvolutionChainDetail = {
    Id : int;
    BabyTriggerItem : ItemSummary;
    Chain : EvolutionChainDetailChain;
  }
  //#endregion
