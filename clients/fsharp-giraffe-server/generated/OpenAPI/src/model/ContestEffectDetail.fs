namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContestEffectEffectText
open OpenAPI.Model.ContestEffectFlavorText

module ContestEffectDetail =

  //#region ContestEffectDetail


  type ContestEffectDetail = {
    Id : int;
    Appeal : int;
    Jam : int;
    EffectEntries : ContestEffectEffectText[];
    FlavorTextEntries : ContestEffectFlavorText[];
  }
  //#endregion
