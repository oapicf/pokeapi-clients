namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaEncounterDetail
open OpenAPI.Model.VersionSummary

module LocationAreaPokemonEncounterVersion =

  //#region LocationAreaPokemonEncounterVersion


  type LocationAreaPokemonEncounterVersion = {
    Version : VersionSummary;
    MaxChance : int;
    EncounterDetails : LocationAreaEncounterDetail[];
  }
  //#endregion
