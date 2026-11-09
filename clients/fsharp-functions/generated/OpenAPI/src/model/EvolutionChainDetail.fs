namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionChainLink
open OpenAPI.Model.ItemSummary

module EvolutionChainDetail =

  //#region EvolutionChainDetail

  [<CLIMutable>]
  type EvolutionChainDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "baby_trigger_item")>]
    BabyTriggerItem : ItemSummary;
    [<JsonProperty(PropertyName = "chain")>]
    Chain : EvolutionChainLink;
  }

  //#endregion
