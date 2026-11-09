namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CharacteristicSummary
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.StatAffectingMoves
open OpenAPI.Model.StatAffectingNatures
open OpenAPI.Model.StatName

module StatDetail =

  //#region StatDetail


  type StatDetail = {
    Id : int;
    Name : string;
    GameIndex : int;
    IsBattleOnly : bool;
    AffectingMoves : StatAffectingMoves;
    AffectingNatures : StatAffectingNatures;
    AffectingItems : ItemSummary[];
    Characteristics : CharacteristicSummary[];
    MoveDamageClass : MoveDamageClassSummary;
    Names : StatName[];
  }
  //#endregion
