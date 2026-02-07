namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

module LocationAreaDetailPokemonEncountersInnerVersionDetailsInner =

  //#region LocationAreaDetailPokemonEncountersInnerVersionDetailsInner

  [<CLIMutable>]
  type LocationAreaDetailPokemonEncountersInnerVersionDetailsInner = {
    [<JsonProperty(PropertyName = "version")>]
    Version : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "max_chance")>]
    MaxChance : int;
    [<JsonProperty(PropertyName = "encounter_details")>]
    EncounterDetails : LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
  }

  //#endregion
