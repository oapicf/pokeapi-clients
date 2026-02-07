namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemSummary
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.VersionGroupSummary

module MachineDetail =

  //#region MachineDetail


  type MachineDetail = {
    Id : int;
    Item : ItemSummary;
    VersionGroup : VersionGroupSummary;
    Move : MoveSummary;
  }
  //#endregion
