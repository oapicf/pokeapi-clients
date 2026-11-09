namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveMetaAilmentName
open OpenAPI.Model.MoveSummary

module MoveMetaAilmentDetail =

  //#region MoveMetaAilmentDetail


  type MoveMetaAilmentDetail = {
    Id : int;
    Name : string;
    Moves : MoveSummary[];
    Names : MoveMetaAilmentName[];
  }
  //#endregion
