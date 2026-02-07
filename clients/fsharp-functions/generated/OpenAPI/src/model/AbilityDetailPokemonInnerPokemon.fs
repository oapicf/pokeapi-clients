namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AbilityDetailPokemonInnerPokemon =

  //#region AbilityDetailPokemonInnerPokemon

  [<CLIMutable>]
  type AbilityDetailPokemonInnerPokemon = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
