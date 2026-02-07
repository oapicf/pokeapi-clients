namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.MoveTargetDescription
open OpenAPI.Model.MoveTargetName

module MoveTargetDetail =

  //#region MoveTargetDetail


  type MoveTargetDetail = {
    Id : int;
    Name : string;
    Descriptions : MoveTargetDescription[];
    Moves : MoveSummary[];
    Names : MoveTargetName[];
  }
  //#endregion
