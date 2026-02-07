namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveBattleStyleName

module MoveBattleStyleDetail =

  //#region MoveBattleStyleDetail


  type MoveBattleStyleDetail = {
    Id : int;
    Name : string;
    Names : MoveBattleStyleName[];
  }
  //#endregion
