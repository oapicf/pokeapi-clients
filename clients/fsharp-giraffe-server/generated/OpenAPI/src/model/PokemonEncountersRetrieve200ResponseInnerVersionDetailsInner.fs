namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion

module PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner =

  //#region PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner


  type pokemon_encounters_retrieve_200_response_inner_version_details_inner = {
    EncounterDetails : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner[];
    MaxChance : decimal;
    Version : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion;
  }
  //#endregion
