namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.VersionGroupSummary

module MachineDetail =

  //#region MachineDetail

  [<CLIMutable>]
  type MachineDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "item")>]
    Item : ItemSummary;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
    [<JsonProperty(PropertyName = "move")>]
    Move : MoveSummary;
  }

  //#endregion
