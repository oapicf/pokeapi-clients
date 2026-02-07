namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveDamageClassDescription
open OpenAPI.Model.MoveDamageClassName
open OpenAPI.Model.MoveSummary

module MoveDamageClassDetail =

  //#region MoveDamageClassDetail


  type MoveDamageClassDetail = {
    Id : int;
    Name : string;
    Descriptions : MoveDamageClassDescription[];
    Moves : MoveSummary[];
    Names : MoveDamageClassName[];
  }
  //#endregion
