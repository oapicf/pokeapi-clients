namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaEncounterDetail
open OpenAPI.Model.VersionSummary

module LocationAreaPokemonEncounterVersion =

  //#region LocationAreaPokemonEncounterVersion

  [<CLIMutable>]
  type LocationAreaPokemonEncounterVersion = {
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
    [<JsonProperty(PropertyName = "max_chance")>]
    MaxChance : int;
    [<JsonProperty(PropertyName = "encounter_details")>]
    EncounterDetails : LocationAreaEncounterDetail[];
  }

  //#endregion
