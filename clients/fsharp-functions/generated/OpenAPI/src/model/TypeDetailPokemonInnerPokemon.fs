namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TypeDetailPokemonInnerPokemon =

  //#region TypeDetailPokemonInnerPokemon

  [<CLIMutable>]
  type TypeDetailPokemonInnerPokemon = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
