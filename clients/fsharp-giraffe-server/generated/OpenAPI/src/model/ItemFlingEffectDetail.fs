namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemFlingEffectEffectText
open OpenAPI.Model.ItemSummary

module ItemFlingEffectDetail =

  //#region ItemFlingEffectDetail


  type ItemFlingEffectDetail = {
    Id : int;
    Name : string;
    EffectEntries : ItemFlingEffectEffectText[];
    Items : ItemSummary[];
  }
  //#endregion
