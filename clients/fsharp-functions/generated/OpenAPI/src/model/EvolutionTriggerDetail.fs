namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionTriggerName
open OpenAPI.Model.PokemonSpeciesSummary

module EvolutionTriggerDetail =

  //#region EvolutionTriggerDetail

  [<CLIMutable>]
  type EvolutionTriggerDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : EvolutionTriggerName[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
  }

  //#endregion
