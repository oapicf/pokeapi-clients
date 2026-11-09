namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.StatSummary

module MoveMetaStatChange =

  //#region MoveMetaStatChange


  type MoveMetaStatChange = {
    Change : int;
    Stat : StatSummary;
  }
  //#endregion
