namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveStatChange

module StatAffectingMoves =

  //#region StatAffectingMoves


  type StatAffectingMoves = {
    Increase : MoveStatChange[];
    Decrease : MoveStatChange[];
  }
  //#endregion
