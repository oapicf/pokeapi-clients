namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaCategoryDescription
open OpenAPI.Model.MoveSummary

module MoveMetaCategoryDetail =

  //#region MoveMetaCategoryDetail


  type MoveMetaCategoryDetail = {
    Id : int;
    Name : string;
    Descriptions : MoveMetaCategoryDescription[];
    Moves : MoveSummary[];
  }
  //#endregion
