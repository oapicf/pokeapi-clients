namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocationAreaPokemonEncounterVersion
open OpenAPI.Model.PokemonSummary

module LocationAreaPokemonEncounter =

  //#region LocationAreaPokemonEncounter


  type LocationAreaPokemonEncounter = {
    Pokemon : PokemonSummary;
    VersionDetails : LocationAreaPokemonEncounterVersion[];
  }
  //#endregion
