namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EggGroupDetailPokemonSpeciesInner =

  //#region EggGroupDetailPokemonSpeciesInner

  [<CLIMutable>]
  type EggGroupDetailPokemonSpeciesInner = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
