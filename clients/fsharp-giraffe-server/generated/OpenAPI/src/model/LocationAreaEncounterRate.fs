namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterMethodSummary
open OpenAPI.Model.LocationAreaEncounterVersionDetail

module LocationAreaEncounterRate =

  //#region LocationAreaEncounterRate


  type LocationAreaEncounterRate = {
    EncounterMethod : EncounterMethodSummary;
    VersionDetails : LocationAreaEncounterVersionDetail[];
  }
  //#endregion
