namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterMethodSummary
open OpenAPI.Model.LocationAreaEncounterVersionDetail

module LocationAreaEncounterRate =

  //#region LocationAreaEncounterRate

  [<CLIMutable>]
  type LocationAreaEncounterRate = {
    [<JsonProperty(PropertyName = "encounter_method")>]
    EncounterMethod : EncounterMethodSummary;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : LocationAreaEncounterVersionDetail[];
  }

  //#endregion
