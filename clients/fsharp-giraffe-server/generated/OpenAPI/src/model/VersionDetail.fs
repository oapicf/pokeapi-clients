namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.VersionName

module VersionDetail =

  //#region VersionDetail


  type VersionDetail = {
    Id : int;
    Name : string;
    Names : VersionName[];
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
