namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveMetaCategoryDescription
open OpenAPI.Model.MoveSummary

module MoveMetaCategoryDetail =

  //#region MoveMetaCategoryDetail

  [<CLIMutable>]
  type MoveMetaCategoryDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : MoveMetaCategoryDescription[];
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
  }

  //#endregion
