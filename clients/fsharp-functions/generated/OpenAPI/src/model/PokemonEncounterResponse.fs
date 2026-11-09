namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaSummary
open OpenAPI.Model.PokemonEncounterVersionDetailResponse

module PokemonEncounterResponse =

  //#region PokemonEncounterResponse

  [<CLIMutable>]
  type PokemonEncounterResponse = {
    [<JsonProperty(PropertyName = "location_area")>]
    LocationArea : LocationAreaSummary;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : PokemonEncounterVersionDetailResponse[];
  }

  //#endregion
