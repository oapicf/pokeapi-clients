namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod

module PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner =

  //#region PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner


  type pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner = {
    Chance : decimal;
    ConditionValues : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner[];
    MaxLevel : decimal;
    Method : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod;
    MinLevel : decimal;
  }
  //#endregion
