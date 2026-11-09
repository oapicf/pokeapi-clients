namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MachineSummary
open OpenAPI.Model.VersionGroupSummary

module ItemMachine =

  //#region ItemMachine


  type ItemMachine = {
    Machine : MachineSummary;
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
