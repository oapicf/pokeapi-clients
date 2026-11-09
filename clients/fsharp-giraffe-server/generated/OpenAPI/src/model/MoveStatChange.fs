namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary

module MoveStatChange =

  //#region MoveStatChange


  type MoveStatChange = {
    Change : int;
    Move : MoveSummary;
  }
  //#endregion
