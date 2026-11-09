namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveMetaAilmentName
open OpenAPI.Model.MoveSummary

module MoveMetaAilmentDetail =

  //#region MoveMetaAilmentDetail

  [<CLIMutable>]
  type MoveMetaAilmentDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveMetaAilmentName[];
  }

  //#endregion
