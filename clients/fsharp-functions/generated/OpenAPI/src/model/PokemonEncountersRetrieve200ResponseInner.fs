namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerLocationArea
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner

module PokemonEncountersRetrieve200ResponseInner =

  //#region PokemonEncountersRetrieve200ResponseInner

  [<CLIMutable>]
  type PokemonEncountersRetrieve200ResponseInner = {
    [<JsonProperty(PropertyName = "location_area")>]
    LocationArea : PokemonEncountersRetrieve200ResponseInnerLocationArea;
    [<JsonProperty(PropertyName = "version_details")>]
    VersionDetails : PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner[];
  }

  //#endregion
