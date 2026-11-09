namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonEvolution
open OpenAPI.Model.PokemonSpeciesSummary

module EvolutionChainLink =

  //#region EvolutionChainLink


  type EvolutionChainLink = {
    IsBaby : bool;
    Species : PokemonSpeciesSummary;
    EvolutionDetails : PokemonEvolution[];
    EvolvesTo : EvolutionChainLink[];
  }
  //#endregion
