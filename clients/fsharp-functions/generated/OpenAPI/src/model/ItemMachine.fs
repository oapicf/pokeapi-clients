namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MachineSummary
open OpenAPI.Model.VersionGroupSummary

module ItemMachine =

  //#region ItemMachine

  [<CLIMutable>]
  type ItemMachine = {
    [<JsonProperty(PropertyName = "machine")>]
    Machine : MachineSummary;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
  }

  //#endregion
