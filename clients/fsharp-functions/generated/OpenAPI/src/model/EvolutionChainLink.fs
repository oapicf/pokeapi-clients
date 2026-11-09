namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokemonEvolution
open OpenAPI.Model.PokemonSpeciesSummary

module EvolutionChainLink =

  //#region EvolutionChainLink

  [<CLIMutable>]
  type EvolutionChainLink = {
    [<JsonProperty(PropertyName = "is_baby")>]
    IsBaby : bool;
    [<JsonProperty(PropertyName = "species")>]
    Species : PokemonSpeciesSummary;
    [<JsonProperty(PropertyName = "evolution_details")>]
    EvolutionDetails : PokemonEvolution[];
    [<JsonProperty(PropertyName = "evolves_to")>]
    EvolvesTo : EvolutionChainLink[];
  }

  //#endregion
