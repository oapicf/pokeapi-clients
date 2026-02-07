namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonEncountersRetrieve200ResponseInnerLocationArea =

  //#region PokemonEncountersRetrieve200ResponseInnerLocationArea

  [<CLIMutable>]
  type PokemonEncountersRetrieve200ResponseInnerLocationArea = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
