namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaSummary
open OpenAPI.Model.PokemonEncounterVersionDetailResponse

module PokemonEncounterResponse =

  //#region PokemonEncounterResponse


  type PokemonEncounterResponse = {
    LocationArea : LocationAreaSummary;
    VersionDetails : PokemonEncounterVersionDetailResponse[];
  }
  //#endregion
