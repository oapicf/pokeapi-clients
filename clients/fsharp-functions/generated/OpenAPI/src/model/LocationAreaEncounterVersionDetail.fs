namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VersionSummary

module LocationAreaEncounterVersionDetail =

  //#region LocationAreaEncounterVersionDetail

  [<CLIMutable>]
  type LocationAreaEncounterVersionDetail = {
    [<JsonProperty(PropertyName = "rate")>]
    Rate : int;
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
  }

  //#endregion
