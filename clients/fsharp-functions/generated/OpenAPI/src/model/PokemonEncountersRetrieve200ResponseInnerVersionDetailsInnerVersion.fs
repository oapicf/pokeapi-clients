namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion =

  //#region PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion

  [<CLIMutable>]
  type PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
