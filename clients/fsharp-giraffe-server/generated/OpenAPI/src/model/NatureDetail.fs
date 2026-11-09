namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.NatureBattleStylePreference
open OpenAPI.Model.NatureName
open OpenAPI.Model.NaturePokeathlonStat
open OpenAPI.Model.StatSummary

module NatureDetail =

  //#region NatureDetail


  type NatureDetail = {
    Id : int;
    Name : string;
    DecreasedStat : StatSummary;
    IncreasedStat : StatSummary;
    LikesFlavor : BerryFlavorSummary;
    HatesFlavor : BerryFlavorSummary;
    PokeathlonStatChanges : NaturePokeathlonStat[];
    MoveBattleStylePreferences : NatureBattleStylePreference[];
    Names : NatureName[];
  }
  //#endregion
