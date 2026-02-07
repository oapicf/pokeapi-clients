namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.MoveTargetDescription
open OpenAPI.Model.MoveTargetName

module MoveTargetDetail =

  //#region MoveTargetDetail

  [<CLIMutable>]
  type MoveTargetDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : MoveTargetDescription[];
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveTargetName[];
  }

  //#endregion
