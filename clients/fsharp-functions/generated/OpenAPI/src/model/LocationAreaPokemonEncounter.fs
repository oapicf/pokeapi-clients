namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocationAreaPokemonEncounterVersion
open OpenAPI.Model.PokemonSummary

module LocationAreaPokemonEncounter =

  //#region LocationAreaPokemonEncounter

  [<CLIMutable>]
  type LocationAreaPokemonEncounter = {
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : PokemonSummary;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : LocationAreaPokemonEncounterVersion[];
  }

  //#endregion
