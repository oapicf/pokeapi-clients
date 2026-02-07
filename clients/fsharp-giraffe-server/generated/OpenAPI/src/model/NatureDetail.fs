namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.BerrySummary
open OpenAPI.Model.NatureBattleStylePreference
open OpenAPI.Model.NatureDetailPokeathlonStatChangesInner
open OpenAPI.Model.NatureName
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
    Berries : BerrySummary[];
    PokeathlonStatChanges : NatureDetailPokeathlonStatChangesInner[];
    MoveBattleStylePreferences : NatureBattleStylePreference[];
    Names : NatureName[];
  }
  //#endregion
