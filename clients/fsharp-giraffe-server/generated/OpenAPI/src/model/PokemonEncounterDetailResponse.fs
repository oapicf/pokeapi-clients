namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionValueSummary
open OpenAPI.Model.EncounterMethodSummary

module PokemonEncounterDetailResponse =

  //#region PokemonEncounterDetailResponse


  type PokemonEncounterDetailResponse = {
    Chance : int;
    ConditionValues : EncounterConditionValueSummary[];
    MaxLevel : int;
    Method : EncounterMethodSummary;
    MinLevel : int;
  }
  //#endregion
