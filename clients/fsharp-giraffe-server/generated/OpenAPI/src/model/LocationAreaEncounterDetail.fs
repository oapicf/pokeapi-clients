namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionValueSummary
open OpenAPI.Model.EncounterMethodSummary
open OpenAPI.Model.EncounterPokemonDetail

module LocationAreaEncounterDetail =

  //#region LocationAreaEncounterDetail


  type LocationAreaEncounterDetail = {
    MinLevel : int;
    MaxLevel : int;
    Chance : int;
    Method : EncounterMethodSummary;
    ConditionValues : EncounterConditionValueSummary[];
    PokemonDetails : EncounterPokemonDetail;
  }
  //#endregion
