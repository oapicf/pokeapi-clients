namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContestEffectEffectText
open OpenAPI.Model.ContestEffectFlavorText

module ContestEffectDetail =

  //#region ContestEffectDetail

  [<CLIMutable>]
  type ContestEffectDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "appeal")>]
    Appeal : int;
    [<JsonProperty(PropertyName = "jam")>]
    Jam : int;
    [<JsonProperty(PropertyName = "effect_entries")>]
    EffectEntries : ContestEffectEffectText[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : ContestEffectFlavorText[];
  }

  //#endregion
