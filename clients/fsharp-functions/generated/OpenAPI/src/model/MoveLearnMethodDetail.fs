namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveLearnMethodDescription
open OpenAPI.Model.MoveLearnMethodName
open OpenAPI.Model.VersionGroupSummary

module MoveLearnMethodDetail =

  //#region MoveLearnMethodDetail

  [<CLIMutable>]
  type MoveLearnMethodDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : MoveLearnMethodName[];
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : MoveLearnMethodDescription[];
    [<JsonProperty(PropertyName = "version_groups")>]
    VersionGroups : VersionGroupSummary[];
  }

  //#endregion
