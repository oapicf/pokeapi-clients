namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StatDetailAffectingMovesIncreaseInner

module StatDetailAffectingMoves =

  //#region StatDetailAffectingMoves


  type StatDetail_affecting_moves = {
    Increase : StatDetailAffectingMovesIncreaseInner[];
    Decrease : StatDetailAffectingMovesIncreaseInner[];
  }
  //#endregion
