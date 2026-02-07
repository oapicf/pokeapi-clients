namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CharacteristicSummary
open OpenAPI.Model.MoveDamageClassSummary
open OpenAPI.Model.StatDetailAffectingMoves
open OpenAPI.Model.StatDetailAffectingNatures
open OpenAPI.Model.StatName

module StatDetail =

  //#region StatDetail


  type StatDetail = {
    Id : int;
    Name : string;
    GameIndex : int;
    IsBattleOnly : bool;
    AffectingMoves : StatDetailAffectingMoves;
    AffectingNatures : StatDetailAffectingNatures;
    Characteristics : CharacteristicSummary[];
    MoveDamageClass : MoveDamageClassSummary;
    Names : StatName[];
  }
  //#endregion
