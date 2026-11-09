namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module EncounterPokemonDetail =

  //#region EncounterPokemonDetail

  [<CLIMutable>]
  type EncounterPokemonDetail = {
    [<JsonProperty(PropertyName = "min_perfect_ivs")>]
    MinPerfectIvs : int option;
    [<JsonProperty(PropertyName = "always_shiny")>]
    AlwaysShiny : bool;
    [<JsonProperty(PropertyName = "never_shiny")>]
    NeverShiny : bool;
    [<JsonProperty(PropertyName = "is_alpha")>]
    IsAlpha : bool;
  }

  //#endregion
