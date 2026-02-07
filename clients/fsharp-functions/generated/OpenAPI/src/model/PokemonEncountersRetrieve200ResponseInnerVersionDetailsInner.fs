namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion

module PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner =

  //#region PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner

  [<CLIMutable>]
  type PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner = {
    [<JsonProperty(PropertyName = "encounter_details")>]
    EncounterDetails : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner[];
    [<JsonProperty(PropertyName = "max_chance")>]
    MaxChance : decimal;
    [<JsonProperty(PropertyName = "version")>]
    Version : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion;
  }

  //#endregion
