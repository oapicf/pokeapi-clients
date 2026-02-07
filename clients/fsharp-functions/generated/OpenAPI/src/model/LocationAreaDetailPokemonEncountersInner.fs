namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner

module LocationAreaDetailPokemonEncountersInner =

  //#region LocationAreaDetailPokemonEncountersInner

  [<CLIMutable>]
  type LocationAreaDetailPokemonEncountersInner = {
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[];
  }

  //#endregion
