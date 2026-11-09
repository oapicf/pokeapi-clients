namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PokemonEvolutionKnownMove =

  //#region PokemonEvolutionKnownMove

  [<CLIMutable>]
  type PokemonEvolutionKnownMove = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
