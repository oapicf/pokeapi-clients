namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary

module MoveComboUsage =

  //#region MoveComboUsage


  type MoveComboUsage = {
    UseBefore : MoveSummary[];
    UseAfter : MoveSummary[];
  }
  //#endregion
