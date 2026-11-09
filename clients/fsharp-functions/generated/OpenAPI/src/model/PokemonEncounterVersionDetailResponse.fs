namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonEncounterDetailResponse
open OpenAPI.Model.VersionSummary

module PokemonEncounterVersionDetailResponse =

  //#region PokemonEncounterVersionDetailResponse

  [<CLIMutable>]
  type PokemonEncounterVersionDetailResponse = {
    [<JsonProperty(PropertyName = "version")>]
    Version : VersionSummary;
    [<JsonProperty(PropertyName = "max_chance")>]
    MaxChance : int;
    [<JsonProperty(PropertyName = "encounter_details")>]
    EncounterDetails : PokemonEncounterDetailResponse[];
  }

  //#endregion
