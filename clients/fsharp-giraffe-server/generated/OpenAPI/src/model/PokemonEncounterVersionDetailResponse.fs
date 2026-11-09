namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonEncounterDetailResponse
open OpenAPI.Model.VersionSummary

module PokemonEncounterVersionDetailResponse =

  //#region PokemonEncounterVersionDetailResponse


  type PokemonEncounterVersionDetailResponse = {
    Version : VersionSummary;
    MaxChance : int;
    EncounterDetails : PokemonEncounterDetailResponse[];
  }
  //#endregion
