namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemFlingEffectEffectText
open OpenAPI.Model.ItemSummary

module ItemFlingEffectDetail =

  //#region ItemFlingEffectDetail

  [<CLIMutable>]
  type ItemFlingEffectDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : ItemFlingEffectEffectText[];
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemSummary[];
  }

  //#endregion
