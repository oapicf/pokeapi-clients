namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.VersionName

module VersionDetail =

  //#region VersionDetail

  [<CLIMutable>]
  type VersionDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : VersionName[];
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
  }

  //#endregion
